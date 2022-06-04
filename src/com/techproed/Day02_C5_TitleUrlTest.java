package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_C5_TitleUrlTest {
    public static void main(String[] args) {
       /*
    1-youtube.com'a gidin
    2-sayfa başlığı video kelimesi içeriyor mu ona bakın
    3-driver'ı kapatın
    */
            System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://youtube.com");
            String youtubeTitle = driver.getTitle();
            System.out.println("youtubeTitle :" + youtubeTitle);
            if (youtubeTitle.toLowerCase(Locale.ROOT).contains("video")) {
                System.out.println(youtubeTitle + " video kelimesi iceriyor");
            } else {
                System.out.println(youtubeTitle + " video kelimesi icermiyor");
            }
            driver.quit();
        }
    }



