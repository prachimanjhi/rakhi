package pages;

import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderSummaryPage extends CommonPage {
    public OrderSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement Checkoutone;
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement BuyNowone;
    @FindBy(xpath = "//a[@class='button-main-content']")
    WebElement Continue;

    public void product(){
        BuyNowone.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkoutone.click();

    }
   public void clickoncontinue()
    {
     BuyNowone.click();
       AllMethods.holdExecutionForSeconds(3);
       Checkoutone.click();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
     AllMethods.holdExecutionForSeconds(3);
        Continue.click();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));

    }

}