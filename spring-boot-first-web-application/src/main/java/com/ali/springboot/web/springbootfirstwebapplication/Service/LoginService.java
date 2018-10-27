package com.ali.springboot.web.springbootfirstwebapplication.Service;

import org.springframework.stereotype.Component;

/**
 * Created by adere on 27.10.2018.
 */
@Component
public class LoginService {

    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("ali") && password.equalsIgnoreCase("abc");
    }
}
