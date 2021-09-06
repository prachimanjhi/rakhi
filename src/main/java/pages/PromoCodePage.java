package pages;

import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PromoCodePage extends CommonPage {
    public PromoCodePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement BuyNow;
    @FindBy(xpath = "//a[@class='button-main-content']")
    WebElement ContinueButton;
    @FindBy(xpath = "//label[text()='Potongan 10 Rupiah']//input[@type='checkbox']")
    WebElement First;
    @FindBy(xpath = "//span[@class='text-amount-amount']")
    WebElement AmountAfterTenRupees;
    @FindBy(xpath = "//label[text()='Potongan 10% - Demo Promo Engine']//input[@type='checkbox']")
    WebElement  Second;
    @FindBy(xpath = "//label[text()='Promo Demo MasterCard']//input[@type='checkbox']")
    WebElement Third;
    @FindBy(xpath = "//a[@class=\"list with-promo\"]")
    WebElement creditdebit;


    public void Promo()
    {
        String ExpectedAfterTenRupee ="19,990";
        String ExpectedAfterTenPercent="18,000";
        String ExpectedAfterThousand ="19,000";
        BuyNow.click();
       AllMethods.holdExecutionForSeconds(2);
        Checkout.click();
        AllMethods.holdExecutionForSeconds(2);
        driver.switchTo().frame(0);
        ContinueButton.click();
        AllMethods.holdExecutionForSeconds(2);
        creditdebit.click();
        AllMethods.holdExecutionForSeconds(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        First.click();

        Assert.assertEquals(AmountAfterTenRupees.getText(),ExpectedAfterTenRupee);
        AllMethods.holdExecutionForSeconds(2);
        Second.click();
       AllMethods.holdExecutionForSeconds(2);
        Assert.assertEquals(AmountAfterTenRupees.getText(),ExpectedAfterTenPercent);
        Third.click();
        AllMethods.holdExecutionForSeconds(2);
        Assert.assertEquals(AmountAfterTenRupees.getText(),ExpectedAfterThousand);

    }
}