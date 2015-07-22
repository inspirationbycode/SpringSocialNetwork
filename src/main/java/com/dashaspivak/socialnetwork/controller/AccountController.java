package com.dashaspivak.socialnetwork.controller;

import com.dashaspivak.socialnetwork.dao.repositories.Repository;
import com.dashaspivak.socialnetwork.dao.repositories.RolesRepository;
import com.dashaspivak.socialnetwork.dao.repositories.UserRepository;
import com.dashaspivak.socialnetwork.model.Photo;
import com.dashaspivak.socialnetwork.model.Roles;
import com.dashaspivak.socialnetwork.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping(value = "/user")
public class AccountController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView registerUserAccount (@ModelAttribute("user") User userModel,
                                      BindingResult result, WebRequest request,
                                      @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                Photo photo = new Photo();
                Blob blob = new SerialBlob(bytes);
                photo.setName(blob);
                Repository<Photo> photoRepository = new Repository<Photo>();
                photoRepository.Add(photo);
                Repository<User> repository = new Repository<User>();
                User user = new User();
                user.setFirst_name(userModel.getFirst_name());
                user.setLast_name(userModel.getLast_name());
                user.setPassword(userModel.getPassword());
                user.setEmail(userModel.getEmail());
                user.setPhone_number(userModel.getPhone_number());
                user.setActive(true);
                user.setId_photo(photo.getId());
                repository.Add(user);
                return new ModelAndView("Success");
            } catch (IOException e) {
                return new ModelAndView("register");
            } catch (SerialException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();
        model.setViewName("SingUp");
        return model;
    }
/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView processingLogin(String email) {
        UserRepository<User> repository = new UserRepository<User>();
        User user = repository.GetUserByIEmail(email);
        Set userInRole = user.getUserInRoles();
        RolesRepository<Roles> rolesRolesRepository = new RolesRepository<Roles>();
        Set<GrantedAuthority> roles = new HashSet();
        //roles.add(new SimpleGrantedAuthority();

        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getEmail(),
                        user.getPassword(),
                        roles);

        ModelAndView model = new ModelAndView();
        model.setViewName("SingUp");
        return model;
    }
*/
}
