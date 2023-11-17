package com.WebApp.ToDoApp;

import java.util.*;
import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.*;
import static org.powermock.api.support.membermodification.MemberModifier.stub;

import org.junit.Test;
import org.powermock.api.support.membermodification.strategy.MethodStubStrategy;

public class SpyTest {
    @Test
    public void spyonArraytest(){
        /*List<String> lst = spy(ArrayList.class);
        lst.add("vamsi");
        verify(lst).add("vamsi");
        assertEquals(1,lst.size());*/

        List<String> listSpy = spy(ArrayList.class);
        listSpy.add("Ranga");


        //stub(listSpy.size()).toReturn(2);
        when(listSpy.size()).thenReturn(2);
        assertEquals(2, listSpy.size());

    }




}
