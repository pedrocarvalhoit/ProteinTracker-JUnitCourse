package test;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

/**Class whit the main anotations */
public class HelloJUnit {

    @Before
    //Behavior before each test
    @After

    @BeforeClass
    //Behavior before all tests of a class
    @AfterClass

    @Ignore
    //Ignores a test

    //Maximum execution time and exception handler
    @Test(timeout = 100, expected = Exception.class)
    public void helloJUnit(){
        System.out.println("Hi");
    }

}
