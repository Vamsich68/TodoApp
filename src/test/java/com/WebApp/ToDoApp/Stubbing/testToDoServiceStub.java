package com.WebApp.ToDoApp.Stubbing;

import com.WebApp.ToDoApp.TestingServices.testToDoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testToDoServiceStub implements testToDoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("spring framework","spring boot","spring security","spring aop");
    }
}
