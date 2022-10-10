package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;

import java.time.Duration;

public class projeödev {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Test
    public void test01() throws InterruptedException {
        //https://allure2you.com/ sitesine gidin
        Driver.getDriver().get("https://allure2you.com ");

        // User click "Üye ol Button"  //sign in butonuna basin
        Driver.getDriver().findElement(By.xpath(" //*[contains(@span,\\\"Register\\\")]")).click();
        //Driver.getDriver().findElement(By.xpath("//*[@class='login inline-type'] ")).click();
       // Thread.sleep(2000);


        //  User click "Become a Vendor" button //  Kullanıcı "Satıcı Ol" düğmesini tıklayın
  // Driver.getDriver().findElement(By.xpath("//*[Text()=' Sign Up']")).click();

        // User enter "Valid Email" input //Kullanıcı "Geçerli E-posta" girişini girer


        // User enter "Valid Password" input //Kullanıcı "Geçerli Şifre" girişini girin

        // User click register button//Kullanıcı kayıt düğmesine tıklayın

        //  User can see Green Block in Email input//Kullanıcı E-posta girişinde Yeşil Blok görebilir


    }
}