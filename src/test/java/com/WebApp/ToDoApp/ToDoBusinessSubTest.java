package com.WebApp.ToDoApp;

import com.WebApp.ToDoApp.Stubbing.testToDoServiceStub;
import com.WebApp.ToDoApp.TestingServices.testToDoBusiness;
import com.WebApp.ToDoApp.TestingServices.testToDoService;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoBusinessSubTest {
    @Test
    public void todoSubTest(){
        testToDoService testToDoService = new testToDoServiceStub();
        testToDoBusiness testToDoBusiness = new testToDoBusiness(testToDoService);
        List<String> todos= testToDoBusiness.retrieveTodosSpring("Vamsi");
        assertEquals(4,todos.size());
    }

}
