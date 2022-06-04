package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_C1_DersTekrari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com"); //google sayfasini gorecegiz
        driver.navigate().to("http://amazon.com"); //amazon sayfasini gorecegiz
        driver.navigate().back();  // google sayfasini gorecegiz
        driver.navigate().forward(); //amazon sayfasini gorecegiz
        driver.navigate().refresh(); // amazon sayfasini yeniler
        driver.quit();
    }
}
