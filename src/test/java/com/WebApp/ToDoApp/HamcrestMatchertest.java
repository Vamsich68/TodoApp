package com.WebApp.ToDoApp;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchertest {
    @Test
    public void test(){

        List<Integer> lst= Arrays.asList(1,2,3,3,44,5,6);
        assertThat(lst, hasSize(7));
        assertThat(lst, everyItem(greaterThan(0)));
        assertThat(lst,everyItem(lessThan(90)));
        Integer[] marks={1,2,3,4};
        assertThat(marks, arrayContaining(1,2,3,4));
        assertThat(marks, arrayWithSize(4));
        assertThat(marks, arrayContainingInAnyOrder(2,1,4,3));

    }
}
