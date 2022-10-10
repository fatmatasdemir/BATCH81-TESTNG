package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority  extends TestBaseBeforeMethodAfterMethod {
/*
 TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
 priority annotation Testlere öncelik vermek için kullanılır.
Kucuk olan Numara daha once calisir priority yazmayan Test method’u varsa oncelikle o calisir,
sonra priority yazan testler siralanir
// Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    //priority methodunu kullanırız
    priority kullanmazsak default olarak 0 dir

 */



    @Test(priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test // Burayi 0 kabul eder
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }



    @Test (priority = -1,groups = "gp1")   // -eksi var bu yuzden ilk burasi calisir sonra default sonra 1 ve 2
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }





}
