package com.WebApp.ToDoApp.PowerMockTest;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.*;

import com.WebApp.ToDoApp.TestingServices.Dependency;
import com.WebApp.ToDoApp.TestingServices.SystemUnderTest;
import com.WebApp.ToDoApp.TestingServices.UtilityClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest({UtilityClass.class})
public class PowerMockitoStaticMethodCall {
    @Mock
    Dependency dependecy;
    @InjectMocks
    SystemUnderTest systemUnderTest;
    @Test
    public void staticMethodCall(){
        when(dependecy.retrieveAllStats()).thenReturn(Arrays.asList(1,3,2));
        PowerMockito.mockStatic(UtilityClass.class);
        when(UtilityClass.staticMethod(anyLong())).thenReturn(150);
        assertEquals(150, systemUnderTest.methodCallingAStaticMethod());
        PowerMockito.verifyStatic();
        UtilityClass.staticMethod(1+2+3);
        PowerMockito.verifyStatic(Mockito.times(1));

    }
}
