package com.ali.springboot.web.springbootfirstwebapplication.Controller;

import com.ali.springboot.web.springbootfirstwebapplication.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(Model model) {

        model.addAttribute("name", "ali");

        return "welcome";
    }

}
