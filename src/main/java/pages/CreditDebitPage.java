package pages;
import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditDebitPage extends CommonPage {
    public CreditDebitPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement BuyNow;
    @FindBy(xpath = "//a[@class='button-main-content']")
    WebElement Continue;
    @FindBy(xpath = "//a[@class=\"list with-promo\"]")
    WebElement creditdebit;
    @FindBy(xpath = "//input[@name='cardnumber']")
    WebElement cardnumber;
    @FindBy(xpath = "//input[@placeholder='MM / YY']")
    WebElement cardmonth;
   @FindBy(xpath = "//input[@placeholder='123']")
   WebElement Cardcvv;
   @FindBy(xpath = "//a[@class='button-main-content']")
   WebElement Paynow;

  public   void creditdebitclick(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
       Checkout.click();
      AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
     AllMethods.holdExecutionForSeconds(3);
        Continue.click();
        AllMethods.holdExecutionForSeconds(3);
      creditdebit.click();


    }
   public void entercarddetails(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkout.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        Continue.click();
        AllMethods.holdExecutionForSeconds(3);
        creditdebit.click();
       AllMethods.holdExecutionForSeconds(3);
        cardnumber.click();
       cardnumber.sendKeys(CommonPage.properties.getProperty("cardnumber"));
        cardmonth.click();
        cardmonth.sendKeys(CommonPage.properties.getProperty("cardmonth"));
        AllMethods.holdExecutionForSeconds(6);
        Cardcvv.click();
        AllMethods.holdExecutionForSeconds(6);
       Cardcvv.sendKeys(CommonPage.properties.getProperty("cardcvv"));
        Paynow.click();

   }

    }

