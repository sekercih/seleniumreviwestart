package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_C7_Homework {
    /*
               1. yeni bir class Homework ainda olusturun,
               2. chromeDriver i kullanarak facebook' a gidin ve sayfa basliginin " facebook" olup olmadigini
                  dogrulayin degilse dogru basligi( actual title ) yazdirin
               3. sayfa URL' sinin facebook icerip icermedigini (contains),
                  degilse dogru URL; yi(actual URL ) yazdirin.
               4. sonra Navigate to http:\\www.walmart.com
               5. Walmart sayfa basliginin " Walmart.com" icerip icermedigini dogrulayin
               6. navigate back to facebook
               7. sayfayi refresh yapin
               8. maximize the window yapin
               9. close the browser
               */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https//www.facebook.com");

        String facebookTitle = driver.getTitle();
        System.out.println("facebookTitle :" + facebookTitle);
        if (facebookTitle.toLowerCase(Locale.ROOT).contains("facebook")) {
            System.out.println("baslik dogrudur");
        } else {
            System.out.println("baslik dogru degildir");
            System.out.println("actual Title :" + facebookTitle);
        }
        String faceUrl = driver.getCurrentUrl();
        System.out.println("faceUrl :" +faceUrl);
        if (faceUrl.toLowerCase(Locale.ROOT).contains("facebook")) {
            System.out.println(faceUrl +" facebook kelimesi iceriyor");
        } else {
            System.out.println(faceUrl +" facebook kelimesi icermiyor");
            System.out.println("actual Url :" + faceUrl);
        }
        driver.navigate().to("http:\\www.walmart.com");
        String walmartTitle = driver.getTitle();
        System.out.println("walmartTitle :" + walmartTitle);
        if (walmartTitle.toLowerCase(Locale.ROOT).contains("Walmart.com")) {
            System.out.println("baslik dogrudur");
        } else {
            System.out.println("baslik dogru degildir");
            System.out.println("actual Title :" + walmartTitle);
        }
        driver.navigate().back();//facebook sayfasini gorecegiz
        driver.navigate().refresh();//facebook sayfasini gorecegiz
        driver.manage().window().maximize();
        driver.close();
    }
}
