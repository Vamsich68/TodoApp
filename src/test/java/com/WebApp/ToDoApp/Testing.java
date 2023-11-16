package com.WebApp.ToDoApp;


import java.util.Arrays;
import com.WebApp.ToDoApp.TestingServices.testToDoBusiness;
import com.WebApp.ToDoApp.TestingServices.testToDoService;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Testing {
    @Test
    public void test(){
        int[] numbers={1,3,2,3,4,2};
        int[] exepcted={1,2,2,3,3,4};
        Arrays.sort(numbers);
        assertArrayEquals(exepcted,numbers);

    }
    @Test()
    //@Test(expected=NullPointerException.class)
    public void testArraySort(){
        try {
            int[] numbers = {};
            Arrays.sort(numbers);
        }
        catch(NullPointerException e){}
    }

    @Test(timeout =100 )
    public void testArrayPerformance(){
        int[] numbers= {1,5,4,23,2};
        for(int i=0;i<100000;i++){
            numbers[0]=i;
            Arrays.sort(numbers);
        }
    }

}
