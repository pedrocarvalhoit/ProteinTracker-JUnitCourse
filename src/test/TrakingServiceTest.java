package test;

import com.simpleprogrammer.TrakingService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrakingServiceTest {

    private TrakingService service;

    //Will restart every time the service
    @Before
    public void setUpService(){
        service = new TrakingService();
    }

    //If i am working on a test and don't want to test, i can ignore
    @Test
    @Ignore
    public void newTrackingServiceIsZero(){
        assertEquals(0, service.getTotal());
    }

    @Test
    public void whenAddingProteinTotalIncreasesByAmount(){
        service.addProtein(10);
        assertEquals(10, service.getTotal());
    }

    @Test
    public void whenRemovingProteinTotalRemainsZero(){
        service.removeProtein(20);
        assertEquals(0, service.getTotal());
    }

}