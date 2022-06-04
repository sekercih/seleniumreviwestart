package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_C1_DersTekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
/*
    <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
    placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
 */
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("computers");

        WebElement okButonu= driver.findElement(By.id("nav-search-submit-button"));
        okButonu.click();

        WebElement yaziElementi = driver.findElement(By.className("sg-col-inner"));
       // System.out.println(yaziElementi.getText()); //1-16 of over 2,000 results for "computers"

        if (yaziElementi.isDisplayed()){     // sonucları sayisini goruyor muyum gormuyor muyum
            System.out.println("goruyorum");  // goruyorum
        }else{
            System.out.println("gormuyorum");

            /*
            dogrulama icin kullandıgımız methodlar;
            getTitle()
            isDisplayed()
            getUrl()
             */
        }
    }
}
