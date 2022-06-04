package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_C6_ifElseTest {
    public static void main(String[] args) {
        /*
    1. Create a class : Day02_ifElseTest
    2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
    olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
    yazdirin.
    3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
    URL'yi yazdırın.
    4. Daha sonra Navigate to https://www.amazon.com/
    5. Navigate back to youtube
    6. Refresh the page
    7. Navigate forward to amazon
    8. Maximize the window
    9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
    doğru başlığı(Actual Title) yazdırın.
    10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    URL'yi yazdırın
    11.Quit the browser
     */
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://youtube.com");

        String youtubeTitle= driver.getTitle();
        System.out.println("youtubeTitle :" + youtubeTitle);

        if (youtubeTitle.toLowerCase(Locale.ROOT).contains("youtube")) { //equalignorecase olmasi gerek..
            System.out.println("baslik dogrudur");
        }else{
            System.out.println("baslik dogru degildir");
            System.out.println("actual Title "+youtubeTitle);
        }

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtubeUrl :" + youtubeUrl);
        if (youtubeUrl.toLowerCase(Locale.ROOT).contains("youtube")) {
            System.out.println(youtubeUrl +" youtube kelimesi iceriyor");
        }else {
            System.out.println(youtubeUrl +" youtube kelimesi icermiyor");
            System.out.println("actual title :" + youtubeUrl);
        }

        driver.navigate().to("https://www.amazon.com/"); //amazon sayfasini gorecegiz
        driver.navigate().back(); //youtube sayfasini gorecegiz
        driver.navigate().refresh();//youtube sayfasini gorecegiz
        driver.navigate().forward();//amazon sayfasini gorecegiz
        driver.manage().window().maximize();//amazon sayfasi maximize

        String Amztitle = driver.getTitle();
        if (Amztitle.toLowerCase().contains("Amazon")){
            System.out.println("title Amazon kelimesi iceriyor");
        }else{
            System.out.println("title Amazon kelimesi icermiyor");
            System.out.println("actual Title "+Amztitle);
        }

        String AmzUrl = driver.getCurrentUrl();
        if (AmzUrl.toLowerCase().contains("https://www.amazon.com/ ")){
            System.out.println("sayfa dogrudur");
        }else{
            System.out.println("sayfa dogru degildir");
            System.out.println("actual Title "+AmzUrl);
        }
        driver.quit();
    }
}
