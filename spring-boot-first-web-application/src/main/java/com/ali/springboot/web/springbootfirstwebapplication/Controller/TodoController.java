package com.ali.springboot.web.springbootfirstwebapplication.Controller;

import com.ali.springboot.web.springbootfirstwebapplication.Service.LoginService;
import com.ali.springboot.web.springbootfirstwebapplication.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by adere on 28.10.2018.
 */
@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodoListPage(Model model) {

        model.addAttribute("todos", service.retrieveTodos("ali"));

        return "list-todos";
    }
}
