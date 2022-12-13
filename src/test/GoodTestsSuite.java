package test;

import com.simpleprogrammer.service.TrakingService;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.category.GoodTestCategory;

/**Run multiples tests, in multiples classes */
@RunWith(Categories.class)
//Setting with categories will be tested in this suite
@Categories.IncludeCategory(GoodTestCategory.class)
//Setting with classes will be tested in this suite
@Suite.SuiteClasses({
        HelloJUnit.class,
        TrakingServiceTest.class
})
public class GoodTestsSuite {
}
