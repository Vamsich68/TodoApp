package com.WebApp.ToDoApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sample {

    @RequestMapping("/start")
    @ResponseBody
    public String start(){
        return "Start learning";
    }
    @RequestMapping("/sayHello")

    public String sayHellojsp(){
        return "sayHello";
    }

}
