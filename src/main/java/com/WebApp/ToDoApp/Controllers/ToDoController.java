package com.WebApp.ToDoApp.Controllers;

import com.WebApp.ToDoApp.Models.ToDo;
import com.WebApp.ToDoApp.ServiceCollection.ToDoService;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import javax.naming.Binding;
import java.time.LocalDate;
import java.util.List;

//@Controller
@SessionAttributes("name")
public class ToDoController {
    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        super();

        this.toDoService = toDoService;
    }

    @RequestMapping("/ToDoList")
    public String listallToDos(ModelMap model){
        String username = getLoggedInUsername(model);
        List<ToDo> todos= toDoService.findByUsername("vamsi");
        model.addAttribute("todos",todos);
        return "ListToDos";
    }
    @RequestMapping(value="/AddToDo",method= RequestMethod.GET)
    public String AddNewToDo(ModelMap model){
        String username = getLoggedInUsername(model);
       //String username= "vamsi";
        ToDo todo = new ToDo(0,username,"", LocalDate.now().plusYears(1),false);
        model.put("todo",todo);
        return "AddToDo";
    }
    @RequestMapping(value ="/AddToDo", method =RequestMethod.POST)
    public String AddNewToDopost(ModelMap model, ToDo todo, BindingResult result){
        String username = getLoggedInUsername(model);
        //String username= "vamsi";
        todo.setUsername(username);
        toDoService.addTodo(username,todo.getDescription(),LocalDate.now().plusYears(1),todo.isDone());
        return "redirect:ToDoList";
    }
    @RequestMapping("/delete")
    public String deleteToDo(@RequestParam int id){
        toDoService.deleteById(id);
        return "redirect:ToDoList";
    }
    @RequestMapping(value="/update",method=RequestMethod.GET)
    public String showUpdate(@RequestParam int id,ModelMap model){
        ToDo todo= toDoService.findById(id);
        model.addAttribute("todo",todo);
        return "AddToDo";
    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public String Update(@RequestParam int id,ModelMap model,@Valid ToDo todo,BindingResult result){
        String username = getLoggedInUsername(model);
        //String username= "vamsi";
        todo.setUsername(username);
        toDoService.updateTodo(todo);
        return "redirect:ToDoList";
    }
    private String getLoggedInUsername(ModelMap model) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
