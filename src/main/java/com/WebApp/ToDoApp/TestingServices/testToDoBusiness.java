package com.WebApp.ToDoApp.TestingServices;

import java.util.ArrayList;
import java.util.List;

public class testToDoBusiness {
    private testToDoService testToDoService;

    public testToDoBusiness(testToDoService testToDoService) {
        this.testToDoService = testToDoService;
    }
    public List<String> retrieveTodosSpring(String user){
        List<String> filtertodos= new ArrayList<>();
        List<String> alltodos= testToDoService.retrieveTodos(user);
        return  alltodos;
    }
}
