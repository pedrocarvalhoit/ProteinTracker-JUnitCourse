package test;

import com.simpleprogrammer.service.TrakingService;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.HelloJUnit;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HelloJUnit.class,
        TrakingServiceTest.class
})
public class ProteinTrackerSuite {
}
