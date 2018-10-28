package com.ali.springboot.web.springbootfirstwebapplication.Controller;

import com.ali.springboot.web.springbootfirstwebapplication.Model.Todo;
import com.ali.springboot.web.springbootfirstwebapplication.Service.LoginService;
import com.ali.springboot.web.springbootfirstwebapplication.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by adere on 28.10.2018.
 */
@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodoListPage(Model model) {

        String name = (String) model.asMap().get("name");

        model.addAttribute("todos", service.retrieveTodos(name));

        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(Model model) {

        model.addAttribute("todo", new Todo(0, (String) model.asMap().get("name"), "", new Date(), false));
        return "add-todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodoPage(@RequestParam int id) {

        service.deleteTodo(id);
        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(Model model, @ModelAttribute Todo todo) {
        service.addTodo((String) model.asMap().get("name"), todo.getDesc(), new Date(), false);

        return "redirect:/list-todos";
    }
}
