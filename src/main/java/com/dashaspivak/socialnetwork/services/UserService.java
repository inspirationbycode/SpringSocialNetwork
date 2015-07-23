package com.dashaspivak.socialnetwork.services;

import com.dashaspivak.socialnetwork.dao.repositories.Repository;
import com.dashaspivak.socialnetwork.dao.repositories.UserRepository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IRepository;
import com.dashaspivak.socialnetwork.interfaces.repositories.IUserRepository;
import com.dashaspivak.socialnetwork.model.User;
import com.dashaspivak.socialnetwork.model.VerificationToken;
import com.dashaspivak.socialnetwork.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.SQLException;
import java.util.UUID;

public class UserService {
    @Autowired
    private MessageSource messageSource;
    private static IUserRepository<User> userRepository;
    private static IRepository<VerificationToken> verificationTokenIRepository;

    static {
        userRepository = new UserRepository<>();
        verificationTokenIRepository = new Repository<>();
    }

    public void RegisterUser(User userModel, User user) throws SQLException {
        VerificationToken token = new VerificationToken();
        token.setToken(UUID.randomUUID().toString());
        verificationTokenIRepository.Add(token);
        user.setVerificationToken(token);

        user.setFirst_name(userModel.getFirst_name());
        user.setLast_name(userModel.getLast_name());

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(userModel.getPassword());
        user.setPassword(hashedPassword);

        user.setEmail(userModel.getEmail());
        user.setPhone_number(userModel.getPhone_number());
        user.setActive(false);
        user.setId_photo(userModel.getId_photo());

        try {
            userRepository.Add(user);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public User getUserById(long id){
        return userRepository.GetById(User.class, id);
    }

    public void activateUser(User user) throws SQLException {
        user.setActive(true);
        try {
            userRepository.Update(user);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
