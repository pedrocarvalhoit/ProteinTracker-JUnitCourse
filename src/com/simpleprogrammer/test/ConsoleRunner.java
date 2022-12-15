package com.simpleprogrammer.test;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class ConsoleRunner {

    public static void main(String[] args) {

        JUnitCore jUnit = new JUnitCore();
        jUnit.addListener(new TextListener(System.out));

        jUnit.run(TrackingServiceTest.class);
    }
}
