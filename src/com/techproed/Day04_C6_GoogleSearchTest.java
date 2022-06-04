package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_C6_GoogleSearchTest {
    public static void main(String[] args) {
        /*
            1. Bir class oluşturun : GoogleSearchTest
            2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
            A.google web sayfasına gidin. https://www.google.com/
            b. Search(ara) “city bike”
            c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
            d. “Shopping” e tıklayın.
            e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

         */
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        //<input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both"
        // aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false"
        // title="Ara" value="" aria-label="Ara" data-ved="0ahUKEwiB1fSI1erwAhVDhf0HHdI7BtMQ39UDCAQ">

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();  //submit(): bir arama kutusundaki bir ogeyi(metni) gonderir-aratir
        //Yaklaşık 934.000.000 sonuç bulundu

        WebElement goruntulemeSayisi = driver.findElement(By.id("result-stats"));
        String goruntulemeYazisi = goruntulemeSayisi.getText();
        System.out.println("goruntuleme sayisi :" + goruntulemeSayisi);

        WebElement alisverisLinki = driver.findElement(By.className("hide-focus-ring"));
        alisverisLinki.click();

    }
}
