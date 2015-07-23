package com.dashaspivak.socialnetwork.interfaces.services;

import com.dashaspivak.socialnetwork.model.User;
import com.dashaspivak.socialnetwork.model.VerificationToken;

public interface IUserService {
    User RegisterUser(User userModel, User user);
    User getUser(String verificationToken);
    void createVerificationToken(User user, String token);
    VerificationToken getVerificationToken(String VerificationToken);
}
