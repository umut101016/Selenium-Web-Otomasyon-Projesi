package com.testinium.test;


import com.testinium.driver.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;



public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        Methods methods = new Methods();
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"), "serwerking@hotmail.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"),"UMUT0114");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.click(By.xpath("//button[@type='submit']"));
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"product-636820\"]/div[1]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-639887\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[5]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-451567\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-433735\"]/div[2]/div[3]/a[4]"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"product-639887\"]/div[2]/div[3]/a[3]/i")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[4]/i")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"product-451567\"]/div[2]/div[3]/a[3]/i")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//*[@id=\"product-433735\"]/div[2]/div[3]/a[3]/i")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]"));
        methods.click(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select/option[10]"));
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.click(By.xpath("//*[@id=\"product-587573\"]/div[3]/div/a/img"));
        methods.click(By.xpath("//*[@id=\"button-cart\"]"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.scrollWithAction(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[4]/i"));
        methods.click(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[4]/i"));
        methods.click(By.cssSelector("h4.common-sprite"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("h4.common-sprite"));
        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//input[@name='quantity']"));
        methods.click(By.xpath("//input[@name='quantity']"));
        methods.waitBySeconds(3);
        driver.findElement(By.xpath("//tbody//tr//td[@class='quantity']//input")).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "3");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));

        methods.click(By.xpath("//*[@id=\"address-firstname-companyname\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"), "sdad");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"address-lastname-title\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-lastname-title\"]"), "ghjgh");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"address-zone-id\"]"));
        methods.click(By.xpath("//*[@id=\"address-zone-id\"]/option[41]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"address-county-id\"]"));
        methods.click(By.xpath("//*[@id=\"address-county-id\"]/option[4]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"district\"]"));
        methods.click(By.xpath("//*[@id=\"districtautocomplete-list\"]/div[1]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"address-address-text\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-address-text\"]"), "juyggf");
        methods.click(By.xpath("//*[@id=\"address-postcode\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-postcode\"]"),"34000");
        methods.click(By.xpath("//*[@id=\"address-mobile-telephone\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-mobile-telephone\"]"),"4897541234");
        methods.click(By.xpath("//*[@id=\"address-telephone\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-telephone\"]"),"5678532154");
        methods.click(By.xpath("//*[@id=\"address-tax-id\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-tax-id\"]"),"");
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"credit-card-owner\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit-card-owner\"]"),"ponpon");

        methods.click(By.xpath("//*[@id=\"credit_card_number_1\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_1\"]"),"5642");
        methods.click(By.xpath("//*[@id=\"credit_card_number_2\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_2\"]"),"4321");
        methods.click(By.xpath("//*[@id=\"credit_card_number_3\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_3\"]"),"9643");
        methods.click(By.xpath("//*[@id=\"credit_card_number_4\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_4\"]"),"5327");
        methods.click(By.xpath("//*[@id=\"credit-card-expire-date-month\"]/option[3]"));
        methods.click(By.xpath("//*[@id=\"credit-card-expire-date-year\"]/option[3]"));
        methods.click(By.xpath("//*[@id=\"credit-card-security-code\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"credit-card-security-code\"]"),"974");
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"logo\"]/a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));

    }
}
