package com.WebApp.ToDoApp.PowerMockTest;

import com.WebApp.ToDoApp.TestingServices.Dependency;
import com.WebApp.ToDoApp.TestingServices.SystemUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import static org.mockito.Mockito.when;
@RunWith(PowerMockRunner.class)
public class PowerMockitoTestingPrivateMethods {
    @Mock
    Dependency dependency;
    @InjectMocks
    SystemUnderTest systemUnderTest;
    @Test
    public void callingPrivateMethods() throws Exception {
        when(dependency.retrieveAllStats()).thenReturn(Arrays.asList(1,2,3));
        long value = (Long) Whitebox.invokeMethod(systemUnderTest,"privateMethodUnderTest");
        assertEquals(6,value);
    }
}
