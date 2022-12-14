package test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.HelloJUnit;
import test.TrackingServiceTest;
import test.category.GoodTestCategory;

/**Run multiples tests, in multiples classes */
@RunWith(Categories.class)
//Setting with categories will be tested in this suite
@Categories.IncludeCategory(GoodTestCategory.class)
//Setting with classes will be tested in this suite
@Suite.SuiteClasses({
        HelloJUnit.class,
        TrackingServiceTest.class
})
public class GoodTestsSuite {
}
