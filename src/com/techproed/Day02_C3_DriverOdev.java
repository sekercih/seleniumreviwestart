package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_C3_DriverOdev {
    //driverı ekranı kaplıcak şekilde kullanalım
    //1-ilk önce google.com'a gidelim
    //2-sayfanın title'ını alalım ekrana yazdıralım
    //3-daha sonra youtube.com'a gidelim
    //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
    //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
    //6-driverımızı kapatalım

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();  // 1. adım  ilk önce google.com'a gidelim
        driver.get("http://google.com");
        driver.manage().window().maximize();

        String googleTitle = driver.getTitle();  // 2. adım  sayfanın title'ını alalım ekrana yazdıralım
        System.out.println("Google Title:"+ googleTitle);

        driver.get("http://youtube.com");  // 3. adım   daha sonra youtube.com'a gidelim
        String youtubeTitle = driver.getTitle();
        System.out.println("Youtube Title:"+ youtubeTitle);

        String youtubeUrl = driver.getCurrentUrl();   // 4. adım   sayfanın title'ını ve urlsini alıp ekrana yazdıralım
        System.out.println(youtubeUrl);

        driver.navigate().back();   // 5. adım  google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
        System.out.println("Google url :" +driver.getCurrentUrl());
        driver.quit();  // 6. adım    driverımızı kapatalım
    }
}
