package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class HomePage {
    Methods methods;
    public HomePage(){
        methods = new Methods();
    }

    public void girisYap(){
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("#js-popup-accept-button"));
        methods.waitBySeconds(2);
        methods.click(By.linkText("Giriş Yap"));
    }


}
