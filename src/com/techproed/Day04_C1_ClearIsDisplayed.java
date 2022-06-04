package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_C1_ClearIsDisplayed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //nesne olustuktan sonra yazilir oncesi hata verir
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");
        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        emailKutusu.clear();

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.isDisplayed(); //webelementin gorunurlulugunu bulur (varligini teyit eder)

        if(signInButton.isDisplayed()){ ////webelementin gorunurlulugunu sorgular
            System.out.println("evet gorunuyor"); //evet gorunuyor
        }else{
            System.out.println("hayir gorunmuyor");
        }
    }
}
