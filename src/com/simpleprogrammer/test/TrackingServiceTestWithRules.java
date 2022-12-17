package com.simpleprogrammer.test;

import com.simpleprogrammer.main.NotifierStub;
import com.simpleprogrammer.main.service.TrackingService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrackingServiceTestWithRules {

    TrackingService service;

    @Before
    public void setUp(){
        service = new TrackingService(new NotifierStub());
    }

    //This rule will be applied in all tests
    @Rule
    public Timeout timeout = new Timeout(200000);

    @Test
    public void badTest(){
        for(int i = 0; i < 100; i++){
            service.addProtein(i);
        }
    }

}