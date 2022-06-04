package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_C4_Alistirma {
    public static void main(String[] args) {
         /*
        1- google.com'a gidelim.
        2- youtube.com'a gidelim.
        3- google.com'a geri donelim
        4- Driver'i fullscreen yapalim
        5- youtube.com'a forward ile tekrar donelim
        6- Bulunugumuz sayfayi yenileyelim.
        7- Driver'i kapatalim.
     */
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}

