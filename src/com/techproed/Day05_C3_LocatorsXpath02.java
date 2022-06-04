package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_C3_LocatorsXpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

    //1.yol
        WebElement welcomeSatir = driver.findElement(By.tagName("h1"));
        System.out.println("welcomeSatir tagName ile :  " + welcomeSatir.getText());
        //welcomeSatir tagName ile :    Welcome to Address Book
    // 2.yol
        WebElement welcomeTo = driver.findElement(By.xpath("//body/div/div/h1"));  //yerine "//h1" de olur
        System.out.println("welcome path ile : " + welcomeTo.getText());
        //welcome path ile :   Welcome to Address Book

    //3.yol
        System.out.println(driver.findElement(By.tagName("h1")).getText()); //Welcome to Address Book

    }
}
