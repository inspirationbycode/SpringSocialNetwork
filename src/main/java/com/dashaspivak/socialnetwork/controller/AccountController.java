package com.dashaspivak.socialnetwork.controller;

import com.dashaspivak.socialnetwork.services.MailService;
import com.dashaspivak.socialnetwork.model.Photo;
import com.dashaspivak.socialnetwork.model.User;
import com.dashaspivak.socialnetwork.services.PhotoService;
import com.dashaspivak.socialnetwork.services.RolesService;
import com.dashaspivak.socialnetwork.services.UserService;
import com.dashaspivak.socialnetwork.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model,
                                       @RequestParam(value = "error", required = false) String error) {
        User user = new User();
        model.addAttribute("user", user);
        return "/account/Register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView registerUserAccount(HttpServletRequest request,
                                     ModelAndView model,
                                     String confirmPassword,
                                     @ModelAttribute("user") User userModel,
                                     @RequestParam("file") MultipartFile file,
                                     @RequestParam(value = "error", required = false) String error) throws SQLException {

        Locale locale = LocaleContextHolder.getLocale();
        if (file.isEmpty()) {
            model.addObject("photo_error", messageSource.getMessage("resource.no_photo_error", null, locale));
            model.setViewName("account/Register");
            return model;
        }

        // Adding photo
        Photo photo = new Photo();
        try {
            byte[] bytes = file.getBytes();
            PhotoService photoService = new PhotoService();
            photoService.AddPhoto(photo, bytes);
        } catch (SQLException e) {
            model.addObject("error", e.getMessage());
            model.setViewName("account/Register");
            return model;
        } catch (IOException e1) {
            model.addObject("error", e1.getMessage());
            model.setViewName("account/Register");
            return model;
        }

        // Adding user
        User user = new User();
        userModel.setId_photo(photo.getId());
        UserValidator validator = new UserValidator(messageSource);
        error = validator.Validate(userModel, confirmPassword);
        if(error != "") {
            model.addObject("error", error);
            model.setViewName("account/Register");
            return model;
        }
        UserService userService = new UserService();
        try {
            userService.RegisterUser(userModel, user);
        } catch (SQLException e1) {
            model.setViewName("account/Register");
            return model;
        }

        // Adding role
        RolesService rolesService = new RolesService();
        rolesService.SetRole(user);

        // Sending mail
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-mail.xml");
        MailService mm = (MailService) context.getBean("mailer");
        String url = request.getRequestURL().toString();
        url = url.substring(0, url.lastIndexOf("/"));
        mm.sendSuccessRegistrationMail(userModel.getEmail(),
                url + "/account/successActivation?token=" + user.getVerificationToken().getToken() + "&id=" +
                user.getId(), user);

        return new ModelAndView("/account/SuccessRegistration");
    }





    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", messageSource.getMessage("resource.sign_up_error", null, LocaleContextHolder.getLocale()));
        }
        model.setViewName("/account/SingUp");
        return model;
    }



    @RequestMapping(value = "/confirmEmail", method = RequestMethod.GET)
    public ModelAndView confirmEmail(WebRequest request, @RequestParam("token") String token, @RequestParam("id") long id) {
        try {
            UserService userService = new UserService();
            User user = userService.getUserById(id);
            if(!user.getVerificationToken().getToken().equals(token))
                throw new IllegalArgumentException("Wrong token.");
            userService.activateUser(user);
            return new ModelAndView("index");
        } catch (SQLException e) {
            e.printStackTrace();
            return new ModelAndView("/general/Rules");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            return new ModelAndView("/general/Rules");
        }
    }



    @RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
    public ModelAndView forgotPassword() {
        return new ModelAndView("/account/ForgotPassword");
    }

    @RequestMapping(value = "/account/successActivation", method = RequestMethod.GET)
    public ModelAndView successActivation() {
        return new ModelAndView("/account/SuccessActivation");
    }


}
