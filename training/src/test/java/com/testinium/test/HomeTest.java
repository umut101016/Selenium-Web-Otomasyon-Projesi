package com.testinium.test;

import com.testinium.driver.BaseTest;
import org.junit.Test;
import com.testinium.page.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage= new HomePage();
        homePage.girisYap();
    }


}
