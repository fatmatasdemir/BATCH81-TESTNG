package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_DepesOfMethod extends TestBaseBeforeMethodAfterMethod {
    /*
Bu yontem, bir metodun diğer bir metoda bağlı olmasını sağlamak için kullanılır.
alttaki (DepesOfMethod  ) method ustekine baglidir
usteki test  başarılı olursa searchTest'in çalıştırılacağı anlamına gelir.
eger basarisiz olursa altaki DepesOfMethod'lu TEST calismaz

     */


    @Test
    public void test1() {
        // amazon ana sayfasına gidelim
        driver.get("https://www.Wamazon1.com");
    }
    @Test (dependsOnMethods = "test1")
    public void test2() {
        //Nutella aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }
    @Test (dependsOnMethods = "test2")
    public void test3() {
        //Sonuc yazısının amazon içerdiğini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));


        //////////////////////////////////////////////////////////////////////////////
    }










}
