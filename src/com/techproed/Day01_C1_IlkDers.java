package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_C1_IlkDers {
    public static void main(String[] args) {
       // System.setProperty:driver i tanitir
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver(); //ChromeDriver dan driver adinda WebDriver turunde obje olusturduk..
        //grt():istedigimiz web sayfasina gider
        //driver imiza get komutu ile google.com a gitmesini soyledik
        driver.get("https://www.google.com"); //driver.navigate().to("https://google.com"); de ayni isi yapar
       // driver.get("https://www.amazon.com");
        //driver.close(); // driver da acik olan sayfayi kapatiyor
        //driver.quit();  // driver da acik butun sayfalari ile tamamen kapatiyor
    }
}
