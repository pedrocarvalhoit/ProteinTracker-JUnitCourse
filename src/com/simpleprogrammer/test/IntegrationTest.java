package com.simpleprogrammer.test;

import com.simpleprogrammer.main.SmsNotifier;
import com.simpleprogrammer.main.exception.InvalidGoalException;
import com.simpleprogrammer.main.service.TrackingService;
import com.techventus.server.voice.Voice;
import com.techventus.server.voice.datatypes.records.SMSThread;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

//This class send a message to google voice account when goal is reached.
//Not working because i don´t have google voice account
public class IntegrationTest {

    private Voice voice;

    @Before
    public void setUp() throws IOException {
        voice = new Voice("pedrohdc@yahoo.com", "123123", "123123123");
    }

    @After
    public void tearDown() throws IOException {
        for (SMSThread thread : voice.getSMSThreads()){
            voice.deleteMessage(thread.getId());
        }
    }

    @Test
    public void goalMetSouldSendNotification() throws InvalidGoalException, IOException {
        TrackingService service = new TrackingService(new SmsNotifier("pedrohdc@yahoo.com", "123123", "123123123"));
        service.setGoal(50);
        service.addProtein(51);

        Assert.assertTrue(voice.getSMS().contains("goal met"));
    }

}
