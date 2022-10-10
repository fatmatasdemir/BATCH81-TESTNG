package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ödev  extends TestBaseBeforeMethodAfterMethod {
    /*
    Yeni bir Class Olusturun : C03_SoftAssert
    “http://zero.webappsecurity.com/” Adresine gidin
    Sign in butonuna basin
    Login kutusuna “username” yazin
    Password kutusuna “password” yazin
    Sign in tusuna basin
    Online banking menusu icinde Pay Bills sayfasina gidin
    “Purchase Foreign Currency” tusuna basin
    “Currency” drop down menusunden Eurozone u secin
    soft assert kullanarak "Eurozone (Euro)" secildigini test edin
    soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
    "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
    "China  (yuan)","Denmark (krone)","Eurozone (euro)",
    "Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)",
    "Mexico (peso)","Norway (krone)","New Zealand  (dollar)",
    "Sweden (krona)","Singapore (dollar)","Thailand (baht)"
    */
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.cssSelector("button[id=signin_button]")).click();
        driver.findElement(By.cssSelector("input[id=user_login]")).sendKeys("username");
        driver.findElement(By.cssSelector("input[id=user_password]")).sendKeys("password");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        driver.navigate().to("http://zero.webappsecurity.com/");
        driver.findElement(By.cssSelector("#onlineBankingMenu")).click();
        driver.findElement(By.cssSelector("#pay_bills_link")).click();
        driver.findElement(By.cssSelector(".ui-tabs-nav.ui-helper-reset>:nth-child(3)")).click();
        WebElement ddm = driver.findElement(By.cssSelector("#pc_currency"));
        Select select = new Select(ddm);
        select = new Select(ddm);
        select.selectByIndex(6);
        softAssert.assertNotEquals(select.getFirstSelectedOption().getText(), "Eurozone (Euro)", "Eurozone (euro) secilemedi");
        List<WebElement> ddmList = select.getOptions();
        List<String> expectedDdm = new ArrayList<>(Arrays.asList("Select One",
                "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)",
                "China (yuan)", "Denmark (krone)", "Eurozone (euro)",
                "Great Britain (pound)", "Hong Kong (dollar)", "Japan (yen)",
                "Mexico (peso)", "Norway (krone)", "New Zealand (dollar)",
                "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)"));
        for (int i = 0; i < ddmList.size(); i++) {
            softAssert.assertEquals(ddmList.get(i).getText(), expectedDdm.get(i), "Dropdown secenekleri beklenen liste ile esit degil");
        }
        softAssert.assertAll();
    }















}
