package pages;





import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BuyNowpage extends CommonPage {
    public BuyNowpage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement Buynow;


    public void buynow(){
        Buynow.click();
        Assert.assertTrue(AllMethods.isDisplayedElement("//td[normalize-space()='Midtrans Pillow']"));
        Assert.assertTrue(AllMethods.isDisplayedElement("//input[@value='20000']"));

    }
    public void checkoutpopup(){
        Buynow.click();
        AllMethods.holdExecutionForSeconds(3);

    }
}