package com.simpleprogrammer.main.notifier;

import com.simpleprogrammer.main.notifier.Notifier;

public class NotifierStub implements Notifier {

    @Override
    public boolean send(String message) {

        return true;
    }

}
