package com.simpleprogrammer.test.suite;

import com.simpleprogrammer.test.HelloJUnit;
import com.simpleprogrammer.test.TrackingServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HelloJUnit.class,
        TrackingServiceTest.class
})
public class ProteinTrackerSuite {
}
