package com.user;

import com.user.model.SignUp;
import com.user.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class userController {

    @Autowired
    private UserManager userManager;

    @PostMapping("")
    public ResponseEntity<?> signUp(SignUp signUp) {
        SignUp sign = userManager.signUp(signUp);
        return null;
    }
}
