package com.simpleprogrammer.main;

import com.simpleprogrammer.main.notifier.Notifier;
import com.techventus.server.voice.Voice;

import java.io.IOException;

public class SmsNotifier implements Notifier {

    private String username;
    private String password;
    private String numberToMessage;

    public SmsNotifier(String username, String password, String numberToMessage) {
        this.username = username;
        this.password = password;
        this.numberToMessage = numberToMessage;
    }

    @Override
    public boolean send(String message) {

        try{
            Voice voice = new Voice(username, password);
            voice.sendSMS(numberToMessage, message);
        }catch(IOException e){
            return false;
        }

        return true;
    }

}
