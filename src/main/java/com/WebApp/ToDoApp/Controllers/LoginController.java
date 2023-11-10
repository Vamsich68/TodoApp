package com.WebApp.ToDoApp.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
    private  AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String login(ModelMap model){
        model.put("name",getLoggedinUsername());

        return "Home";
    }
    private String getLoggedinUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();

    }
   /* @RequestMapping(value="/login",method = RequestMethod.POST)
    public String HomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authService.authenticate(name,password)){
            model.put("name",name);
            model.put("password",password);
            return "Home";
        }


        return "Home";



    }*/

}
