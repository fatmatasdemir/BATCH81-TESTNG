package tests.day21;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.log4J.Log4jTest1;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
public class C01_ScreenShotReusableMethod {
    private static Logger logger = LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());
    @Test
    public void test01() throws IOException {
        logger.info("Hepsi burada sitesine gidilir");
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Ve sayfanın resmini alınız
        logger.info("Ekran görüntüsü alinir");
        ReusableMethods.getScreenshot("hepsiburada");
        //Sayfayı kapatınız
        logger.warn("Driver kapatilir");
        Driver.closeDriver();
    }
    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage = new AmazonPage();
        //Nutella aratınız
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amznPage.aramaSonucWE);
    }
}