package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_C2_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // driver i tum sayfaya kaplatiyoruz...

        driver.manage().window().fullscreen();// tam ekran yapiyor-- f11 yaptigini yapar

        driver.get("http://google.com");

        driver.navigate().to("http://amazon.com"); //amazon sayfasina gitmemize yariyor..get methodu ile ayni gorevi goruyor

        // navigate method icerisine URL veya String yazabiliyoruz.
        // get ile navigate arasinda fark yok. Aradaki tek fark get method'u daha hizli calisir.

        driver.navigate().back();  // once google sonra amazon sayfasina gidip tekrar gooogle geri doner <- tusunun görevini gördü

        driver.navigate().forward(); //  tekrar  amazon sayfasina gider //oncesine donmus oldugumuz sayfadan ileriye eski haline gittik

        driver.navigate().refresh(); // oldugu sayfayi yeniler

        driver.close();
    }
}
