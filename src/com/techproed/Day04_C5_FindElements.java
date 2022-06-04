package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_C5_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");


        List<WebElement> listem = driver.findElements(By.tagName("a"));  //[x,y,z]

        for(WebElement w : listem){  //for (i=1, i<listem.size, i++)
            System.out.print("web sayfasindaki web elementler :"+ w.getText()); //web sayfasindaki web elementler :Home
                                                                                //web sayfasindaki web elementler :Sign in
        }

        for (int i = 0; i < listem.size(); i++) {
            WebElement elemanlarim = listem.get(i);
            System.out.println("fori ile web elemnetler :" +elemanlarim.getText()); //fori ile web elemnetler :Home
                                                                                    //fori ile web elemnetler :Sign in
        }

        listem.stream().forEach(x-> System.out.println(x.getText()));   //Home
                                                                        //Sign in
    }
}
