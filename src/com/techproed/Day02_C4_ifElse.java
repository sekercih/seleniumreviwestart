package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_C4_ifElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();
        System.out.println("amazon title :" + amazonTitle);

        if (amazonTitle.toLowerCase(Locale.ROOT).contains("computer")) {
            System.out.println(amazonTitle + " ' da computer kelimesi geciyor");
        } else {
            System.out.println(amazonTitle + " ' da computer kelimesi gecmiyor");

        }
    }
}
