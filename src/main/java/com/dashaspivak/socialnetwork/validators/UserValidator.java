package com.dashaspivak.socialnetwork.validators;

import com.dashaspivak.socialnetwork.dao.repositories.UserRepository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IUserRepository;
import com.dashaspivak.socialnetwork.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class UserValidator {
    @Autowired
    private MessageSource messageSource;
    private static IUserRepository<User> userRepository;

    static {
        userRepository = new UserRepository<>();
    }

    public UserValidator(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    public String Validate(User user, String confirmPassword){
        Locale locale = LocaleContextHolder.getLocale();
        if(userRepository.GetUserByIEmail(user.getEmail()) != null)
            return messageSource.getMessage("resource.email_exists", null, locale);
        if(!user.getPassword().equals(confirmPassword))
            return messageSource.getMessage("resource.passwords_not_equal", null, locale);
        return "";
    }

}
