package pages;

import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PaynowPage extends CommonPage {
    public PaynowPage(WebDriver driver) {
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

public void paynow()
{
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

   AllMethods.holdExecutionForSeconds(3);
    Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
    AllMethods.holdExecutionForSeconds(10);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//p[@id='merchant_name']"));
  AllMethods.holdExecutionForSeconds(3);
    driver.findElement(By.xpath("//p[@id='txn_amount']"));
    AllMethods.holdExecutionForSeconds(3);
    driver.findElement(By.xpath("//p[@id='txn_time']"));
    AllMethods.holdExecutionForSeconds(3);
    driver.findElement(By.xpath("//p[@id='card_number']"));
    AllMethods.holdExecutionForSeconds(3);
    Assert.assertTrue(AllMethods.isDisplayedElement("//button[@name='ok']"));

}

}