package com.dashaspivak.socialnetwork.services;

import com.dashaspivak.socialnetwork.model.User;
import com.mysql.fabric.Server;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailService {
    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSuccessRegistrationMail(String to, String confirmUrl, User user) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("workwithinstagram@gmail.com");
        message.setTo(to);
        message.setSubject("Confirm Registration");
        message.setText("Hello, " + user.getLast_name() + " " + user.getFirst_name() +
                "!\n" + "Please verify your email by following this link " + confirmUrl + ".");
        mailSender.send(message);
    }
}
