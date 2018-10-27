package com.ali.springboot.web.springbootfirstwebapplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String index(Model model) {

        System.out.print("hey");

        return "Hello World ";
    }

    public String dummyx() {
        return  "   ";
    }

}
