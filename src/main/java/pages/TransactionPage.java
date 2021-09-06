package pages;
import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransactionPage extends CommonPage {
    public TransactionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    } @FindBy(xpath = "//div[@class='cart-checkout']")
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
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='ok']")
    WebElement ok;
    @FindBy(xpath = "//button[@name='cancel']")
    WebElement cancel;
   public void okbuttonvalidotp(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkout.click();
       AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
       AllMethods.holdExecutionForSeconds(3);
        Continue.click();
     AllMethods.holdExecutionForSeconds(3);
        driver.findElement(By.xpath("//a[@class=\"list with-promo\"]")).click();
        AllMethods.holdExecutionForSeconds(3);
       cardnumber.click();
        cardnumber.sendKeys("4811-1111-1111-1114");
      cardmonth.click();
       cardmonth.sendKeys("02-22/");
        Cardcvv.click();
       Cardcvv.sendKeys("123");
        Paynow.click();
       AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
        AllMethods.holdExecutionForSeconds(10);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        password.click();
        password.sendKeys("112233");
        ok.click();

        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));;
    }
    @Test
  public  void invalidotp(){

        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkout.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        Continue.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.findElement(By.xpath("//a[@class=\"list with-promo\"]")).click();
        AllMethods.holdExecutionForSeconds(3);
        cardnumber.click();
        cardnumber.sendKeys("4811-1111-1111-1114");
        cardmonth.click();
        cardmonth.sendKeys("02-22/");
        Cardcvv.click();
        Cardcvv.sendKeys("123");
        Paynow.click();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
        AllMethods.holdExecutionForSeconds(10);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        password.click();
        password.sendKeys("112234");
        ok.click();

        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);

        Assert.assertTrue(AllMethods.isDisplayedElement("//span[text()=\"Transaction failed\"]"));

    }

    public void clickoncanelbutton(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkout.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        Continue.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.findElement(By.xpath("//a[@class=\"list with-promo\"]")).click();
        AllMethods.holdExecutionForSeconds(3);
        cardnumber.click();
        cardnumber.sendKeys(CommonPage.properties.getProperty("cardnumber"));
        cardmonth.click();
        cardmonth.sendKeys(CommonPage.properties.getProperty("cardmonth"));
        Cardcvv.click();
        Cardcvv.sendKeys(CommonPage.properties.getProperty("cardcvv"));
        Paynow.click();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
        AllMethods.holdExecutionForSeconds(10);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        password.click();
        password.sendKeys(CommonPage.properties.getProperty("password"));

        cancel.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        Assert.assertTrue(AllMethods.isDisplayedElement("//span[text()=\"Transaction failed\"]"));
    }


}


