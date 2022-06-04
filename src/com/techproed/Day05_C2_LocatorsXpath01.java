package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_C2_LocatorsXpath01 {
    public static void main(String[] args) {
        /*
        selenium dersinde locators konusu dendiginde akla gelen ilk method xpath olmalidir.
        Absolute xpath:Mutlak :Parent dan child a tek tek gidilir,yaygin olarak kullanilmaz..tag ler arasinda '/' kullanilir
        Absolute xpath = //body/div/header/div/div/div/div
        Eger ayni path’e sahip birden fazla element varsa index kullanilabilir. [2] gibi

        Relative xpath:Bagil :Yaygin kullanilir '//' kullanilarak bir elemente gidilir.
        ***tagName[@attribute='value'];
        Relative xpath = //div[@id='logo'] veya //div[@class=’flex col logo’]
*/
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

   /* <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
       incele yapip ctrl F ile arariz..
       //input[@type='email']
       //input[@class='form-control']
       (//input[@class='form-control'])[2] yukaridaki ile ayni path oldugu icin index olarak yazariz [2] demek ikincisini bul demek
       (//input[@class='form-control'])[1]  birinci webelemente gider..kimi yerde () kimi yerde de [] ile bakariz

        //input[@class='form-control' and @ type='email']
        //input[@class='form-control' or @ type='email']
   */
        /*
        Username : testtechproed@gmail.com
        Password : Test1234!
        //   //tagName[@attribute='value'];


    <input type="email" class="form-control" placeholder="Email" data-test="email"
    name="session[email]" id="session_email">
    */
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailKutusu =driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
    /*
    <input class="form-control" placeholder="Password" data-test="password" type="password"
    name="session[password]" id="session_password">
     */
        WebElement passwordKutusu =driver.findElement(By.xpath("//input[@type='password']"));
        passwordKutusu.sendKeys("Test1234!");

    /*
    <input type="submit" name="commit" value="Sign in" class="btn btn-primary"
    data-test="submit" data-disable-with="Sign in">
     */

        WebElement signInButon= driver.findElement(By.xpath("//input[@type = 'submit']"));
        signInButon.click();



/* hata verirse...
try {
    Thread.sleep(3000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
 */

    }
}
