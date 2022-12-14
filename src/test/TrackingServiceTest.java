package test;

import com.simpleprogrammer.exception.InvalidGoalException;
import com.simpleprogrammer.service.TrackingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Assertions;
import test.category.GoodTestCategory;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrackingServiceTest {

    private TrackingService service;

    //Will restart every time the service
    @Before
    public void setUpService(){
        service = new TrackingService();
    }

    //If i am working on a test and don't want to test, i can ignore
    //@Ignore
    @Test
    @Category(GoodTestCategory.class)
    public void newTrackingServiceIsZero(){

        assertEquals(0, service.getTotal());
    }

    @Test
    @Category(GoodTestCategory.class)
    public void whenAddingProteinTotalIncreasesByAmount(){
        service.addProtein(10);
        assertEquals(10, service.getTotal());
        //Just another sintaxe
        assertThat(service.getTotal(), is(10));
        //More complex, testing more than one topic
        assertThat(service.getTotal(), allOf(is(10), instanceOf(Integer.class)));

    }

    @Test
    public void whenRemovingProteinTotalRemainsZero(){
        service.removeProtein(20);
        assertEquals(0, service.getTotal());
    }

    //Exception test
    @Test(expected = InvalidGoalException.class)
    public void exceptionWhenGoalIsLessThenZero() throws InvalidGoalException {
        service.setGoal(-5);
    }

    //In case of multiple tests can set a time target to each one
    @Test(timeout = 200)
    public void badTest(){
        for(int i = 0; i < 1000000000; i++){
            service.addProtein(i);
        }
    }
}