package com.simpleprogrammer.test;

import com.simpleprogrammer.main.notifier.NotifierStub;
import com.simpleprogrammer.main.service.TrackingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

//Test for the input and expected result for proteinAdd()
@RunWith(Parameterized.class)
public class ParameterizedTests {

    private int input;
    private int expectedResult;
    private static TrackingService service = new TrackingService(new NotifierStub());

    public ParameterizedTests(int input, int expectedResult){
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object> data(){
        return Arrays.asList(new Object[][]{
                //If add 5gr protein, total should be 5
                {5, 5},
                //than...
                {5, 10},
                {-12, 0},
                {50, 50},
                {1, 51}
        });
    }

    @Test
    public void test(){
        if(input >= 0)
            service.addProtein(input);
        else
            service.removeProtein(-input);

        assertEquals(expectedResult, service.getTotal());
    }


}
