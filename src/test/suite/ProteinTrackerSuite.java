package test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.HelloJUnit;
import test.TrackingServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HelloJUnit.class,
        TrackingServiceTest.class
})
public class ProteinTrackerSuite {
}
