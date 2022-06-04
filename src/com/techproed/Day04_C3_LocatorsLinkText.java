package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_C3_LocatorsLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //nesne olustuktan sonra yazilir oncesi hata verir
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki = driver.findElement(By.linkText("Sign in")); //LinkText ile Sign in linkini tikla..
        signInLinki.click();

        // WebElement homeLinki = driver.findElement(By.linkText("Home"));
        // homeLinki.click(); //Hata verdi.. locator yanlis yazilmis...

        WebElement homeLink=driver.findElement(By.partialLinkText("Home")); //"     Home      " icinde Home geceni buluyor
        homeLink.click();

        WebElement homelink = driver.findElement(By.partialLinkText("om")); // icerisinde  "om" (home nin om si) olan linklerin ilkini alır
        homelink.click();
    }
}
