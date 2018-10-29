package com.ali.springboot.web.springbootfirstwebapplication.Controller;

import com.ali.springboot.web.springbootfirstwebapplication.Model.Todo;
import com.ali.springboot.web.springbootfirstwebapplication.Service.LoginService;
import com.ali.springboot.web.springbootfirstwebapplication.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

        model.addAttribute("todo", new Todo(0, (String) model.asMap().get("name"), "Default Desc", new Date(), false));
        return "add-todo";
    }

    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteTodoPage(@RequestParam int id) {

        service.deleteTodo(id);
        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(Model model, @ModelAttribute @Valid Todo todo, BindingResult result) {

        if(result.hasErrors()) {
            return "add-todo";
        }


        service.addTodo((String) model.asMap().get("name"), todo.getDesc(), new Date(), false);

        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String updateTodoPage(@RequestParam int id, Model model) {

        Todo todo = service.retrieveTodo(id);

        model.addAttribute("todo", todo);

        return "add-todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodo(Model model, @ModelAttribute @Valid Todo todo, BindingResult result) {

        if(result.hasErrors()) {
            return "add-todo";
        }

        /*
        Todo permTodo = service.retrieveTodo(todo.getId());

        permTodo.setDesc(todo.getDesc());
        */

        todo.setUser((String)model.asMap().get("name"));
        service.updateTodo(todo);

        return "redirect:/list-todos";
    }
}
