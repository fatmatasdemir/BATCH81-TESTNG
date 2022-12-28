package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {




     public FacebookPage() {

          PageFactory.initElements(Driver.getDriver(), this);
     }



     //  Driver.getDriver().findElement(By.xpath("//*[text()='Temel ve isteğe bağlı çerezlere izin ver'] ")).click();
    // @FindBy(xpath ="//*[text()='Temel ve isteğe bağlı çerezlere izin ver'] " )
    // public static WebElement cerezButonu;

     @FindBy(xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
     public WebElement cookieButonu;


     @FindBy(xpath = "//*[@id='email']")
     public WebElement email;

     @FindBy(xpath = "//*[@id='pass']")
     public WebElement sifre;

     @FindBy(xpath = "//*[@class='_9ay7']")
     public WebElement girisYapilmadi;

     @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
     public WebElement login;









}
