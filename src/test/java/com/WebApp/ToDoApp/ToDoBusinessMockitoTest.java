package com.WebApp.ToDoApp;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.List;

import com.WebApp.ToDoApp.TestingServices.testToDoBusiness;
import com.WebApp.ToDoApp.TestingServices.testToDoService;
import org.junit.Test;
import org.mockito.Mock;


public class ToDoBusinessMockitoTest {
    @Test
    public void testUsingMockito(){
        testToDoService testToDoService = mock(testToDoService.class);
        List<String> allTodos= Arrays.asList("spring boot","spring framework","spring security","spring aop");
        when(testToDoService.retrieveTodos("user")).thenReturn(allTodos);
        testToDoBusiness testToDoBusiness= new testToDoBusiness(testToDoService);
        List<String> todos= testToDoBusiness.retrieveTodosSpring("user");
        assertEquals(4,todos.size() );
    }
    //@Test(expected = RuntimeException.class)
    @Test
    public void usingMockito_List(){
        List lst = mock(List.class);
        //when(lst.size()).thenReturn(2).thenReturn(3);
        //when(lst.size()).thenThrow(new RuntimeException("runtime exception"));
        //when(lst.get(anyInt())).thenReturn(2);
        //when(lst.size()).thenReturn(2);
        given(lst.size()).willReturn(2);
        //lst.size();
        //assertEquals(2,lst.size());
        assertThat(lst.size(),is(2));
        //assertEquals(3,lst.size());
    }
}


