package com.WebApp.ToDoApp;

import com.WebApp.ToDoApp.TestingServices.testToDoBusiness;
import com.WebApp.ToDoApp.TestingServices.testToDoService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


//@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
public class MocksTest {

    @Rule
    public MockitoRule mockitoRule= MockitoJUnit.rule();
    @Mock
    testToDoService testToDoService;
    @InjectMocks
    testToDoBusiness testToDoBusiness;


    @Test
    public void testUsingMockito(){

        List<String> allTodos= Arrays.asList("spring boot","spring framework","spring security","spring aop");
        when(testToDoService.retrieveTodos("user")).thenReturn(allTodos);

        List<String> todos= testToDoBusiness.retrieveTodosSpring("user");
        assertEquals(4,todos.size() );
    }
    //@Test(expected = RuntimeException.class)
    /*@Test
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
    }*/
}


