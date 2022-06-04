package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_C4_LocatorstagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");

        // id , name , class linkText , partialLinkText
        ///<a class="nav-item nav-link active" data-test="home" href="/">
        //          Home
        //          <span class="sr-only">(current)</span>
        //</a>
        WebElement homeTagName = driver.findElement(By.tagName("a"));
        homeTagName.click();

        String homeYazisi = homeTagName.getText();
        System.out.println("home elementinin yazisi = " + homeYazisi);

    }
}
