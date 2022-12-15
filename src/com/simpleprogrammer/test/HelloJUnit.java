package com.simpleprogrammer.test;

import org.junit.*;
import org.junit.experimental.categories.Category;
import com.simpleprogrammer.test.category.GoodTestCategory;

/**Class whit the main anotations */
@Category(GoodTestCategory.class)
public class HelloJUnit {

    @Test()
    public void helloJUnit(){

        System.out.println("Hi");
    }

}
