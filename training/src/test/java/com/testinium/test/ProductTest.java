package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.ProductPage;
import org.junit.Assert;
import org.junit.Test;
import com.testinium.page.LoginPage;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

        @Test
        public void productSelectTest() {
                ProductPage productPage = new ProductPage();
                productPage.productSelection();

        }

        @Test
        public void productAddControlFavoritesTest() {

                HomePage homePage = new HomePage();
                LoginPage loginPage = new LoginPage();
                ProductPage productPage = new ProductPage();

                homePage.girisYap();
                loginPage.loginAndControl();
                productPage.productSelection();
                productPage.addFavorites();
                productPage.controlFavorites();
                {

                }
        }
}







