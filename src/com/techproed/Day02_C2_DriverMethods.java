package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_C2_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        //amazonTitle i alir
        String amazonTitle = driver.getTitle();
        //amazonTitle i yazdirir
        System.out.println("amazonun title'ı : " + amazonTitle);
        //amazonun title'ı : Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more


        // amazon URL sini alir
        String amazonUrl = driver.getCurrentUrl();
        // amazon URL sini yazdirir
        System.out.println("amazonun Url'si : " + amazonUrl); //amazonun Url'si : https://www.amazon.com/
    }
}
