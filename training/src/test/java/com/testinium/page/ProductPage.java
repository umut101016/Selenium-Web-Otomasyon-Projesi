package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;

    Logger logger = LogManager.getLogger(ProductPage.class);




    public ProductPage() { methods = new Methods();}


    public void productSelection() {
        //methods.click(By.cssSelector("#js-popup-accept-button"));
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.waitBySeconds(3);
        methods.sendEnter(By.id("search-input"));
        methods.waitBySeconds(3);
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#product-440988 > div.grid_7.omega > div.image > div > a > img"));
        methods.waitBySeconds(3);

    }

    public void addFavorites(){
        methods.scrollWithJavaScript(By.className("product-info__item"));
        methods.waitBySeconds(5);
        //methods.click(By.className("personal-lists__link"));
        methods.click(By.cssSelector("#product-detail-add-to-favorites > a > span"));
        methods.waitBySeconds(1);

    }


    public void controlFavorites() {
        Assert.assertTrue(methods.isElementVisible(By.className(".swal2-title.ky-swal-title-single")));
        methods.waitBySeconds(5);
    }

}
