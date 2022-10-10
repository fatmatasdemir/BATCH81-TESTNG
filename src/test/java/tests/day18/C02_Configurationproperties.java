package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_Configurationproperties {

    @Test
    public void test01() throws InterruptedException {
        //Amazon sayfasina gidelim ve facebook sayfasina gidiniz
       String urlamzn=ConfigReader.getProperty("amznUrl");
       String urlFace=ConfigReader.getProperty("faceUrl");
       Driver.getDriver().get(urlamzn);
       Driver.getDriver().get(urlFace);




    // Driver.getDriver().findElement(By.xpath("//*[text()='Temel ve isteğe bağlı çerezlere izin ver'] ")).click();

     // Driver.closeDriver();


    }
}
