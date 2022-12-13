package test;

import org.junit.*;
import org.junit.experimental.categories.Category;
import test.category.GoodTestCategory;

import static org.junit.jupiter.api.Assertions.*;

/**Class whit the main anotations */
@Category(GoodTestCategory.class)
public class HelloJUnit {

    @Test()
    public void helloJUnit(){

        System.out.println("Hi");
    }

}
