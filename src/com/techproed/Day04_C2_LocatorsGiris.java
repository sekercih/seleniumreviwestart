package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_C2_LocatorsGiris {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //nesne olustuktan sonra yazilir oncesi hata verir
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");

        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();

        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailkutusu = driver.findElement(By.className("form-control"));
        emailkutusu.sendKeys("testtechproed@gmail.com");  //email kutusunun icine yazar :testtechproed@gmail.com

        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
       //WebElement passwordKutusu = driver.findElement(By.className("form-control"));
       //passwordKutusu.sendKeys("Test1234!");  //email kutusunun icine yazar :testtechproed@gmail.comTest1234!

       //! Ayni class degerine sahip attribute e sahip  veriler lokasyon ayni oldugu icin ayni yere yollar veriyi...ilk buldugu yere yazar

        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        passwordKutusu.sendKeys("Test1234!");
    }
}
