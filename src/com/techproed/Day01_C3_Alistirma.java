package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_C3_Alistirma {
    public static void main(String[] args) {
        //1. google.com gidin
        // 2. Navigate to methodu ile amazon a gidin
        // 3. Navigate back ile geri gelin
        // 4. forward metodu ile tekrar ileri gidin
        // 5. bulundugunuz sayfayi yenileyin
        // 6.driveri kapatın.

        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.close();
    }
}
