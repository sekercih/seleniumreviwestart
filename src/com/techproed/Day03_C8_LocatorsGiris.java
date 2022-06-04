package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Day03_C8_LocatorsGiris {
    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    1. http://a.testaddressbook.com/sign_in adresine gidiniz.
    2. email textbox,password textbox, and signin button elementlerini locate ediniz..
    3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    4. Username : testtechproed@gmail.com
    5. Password : Test1234!
    6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet/Documents/seleniumdependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // verilen sure kadar bekleme yapacak...hatalarin cogu bekleme suresinin konmamasindan kaynaklanir
        // sayfa bekleme yapinca girilmesi gereken kutucuklari doldurur...yani Webelementlerini yerlestirecek zaman kazanir
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //5 saniye

        // time – The amount of time to wait.
        // unit – The unit of measure for time.

        driver.get("http://a.testaddressbook.com");

        String name= "testtechproed@gmail.com";

        // WebElement : bir web sayıfasındaki web elementlerin date type'i WebElementtir.
        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        //sign in linkini bulur
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        //singInLinkini id attribute i ile tiklar
        signInLinki.click();

        //email kutusunu id attribute i ile bulur
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //email kutusuna yazi gonderir
        emailKutusu.sendKeys("testtechproed@gmail.com");
/*
    Eger sayfa yuklenmeden once calistirirsaniz “No Such Element Exception.” verir, Default “sifir saniyedir”.
    bu methodu Bir kere yazinca Exception firlatmadan once belirttiginiz saniye kadar bekler
 */
        //pasword kutusunu id attribute i ile bulur
        WebElement passwordKutusu = driver.findElement(By.id("session_password"));

        //password kutusuna yazi gonderir
        passwordKutusu.sendKeys("Test1234!");

        //sign in buttonunu name attribute i ile bulur
        WebElement signInButton = driver.findElement(By.name("commit"));

        //sign in buttonuna tiklar
        signInButton.click();

    //dogru sayfada olup olmadigimizi arattirdik..
        //url dogrulama--sayfa url sinde arama
        String  url = driver.getCurrentUrl();
        System.out.println("Testaddressbook url si :" +url); //Testaddressbook url si :http://a.testaddressbook.com/

        if (url.toLowerCase(Locale.ROOT).contains("addressbook")) {
            System.out.println("iceriyor" ); //iceriyor
        }else {
            System.out.println("icermiyor");
        }

        //title dogrulama--sayfa basliginda arama
        String  title = driver.getTitle();
        System.out.println("Testaddressbook title i :" +title);

        if (title.toLowerCase(Locale.ROOT).contains("address")) {
            System.out.println("dogru sayfadir" ); //dogru sayfadir
        }else {
            System.out.println("dogru sayfa degildir");
        }
        // html de head de kiler web elemnet degildir.. yani title (sayfa basligi)
        // body kismindakiler sayfanin web elementleridir cunku sayfada bunlar gorunur
        driver.quit();
    }
}
