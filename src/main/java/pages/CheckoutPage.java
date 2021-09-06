
package pages;





import allmethods.AllMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends CommonPage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//a[normalize-space()='BUY NOW']")
    WebElement BuyNow;
    @FindBy(xpath = "//input[@value='Budi']")
    WebElement name;
    @FindBy(xpath ="//input[@value='budi@utomo.com']" )
    WebElement email;
    @FindBy(xpath ="//input[@value='081808466410']")
    WebElement phonenumber;
    @FindBy(xpath = "//input[@value='Jakarta']")
    WebElement city;
    @FindBy(xpath = "//textarea[normalize-space()='MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11']")
    WebElement address;
    @FindBy(xpath = "//input[@value='10220']")
    WebElement postalcode;


    public void verifynameemailoncheckoutpage(){
         BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
         name.click();
        AllMethods.holdExecutionForSeconds(3);
         email.click();
        AllMethods.holdExecutionForSeconds(3);

        phonenumber.click();
        AllMethods.holdExecutionForSeconds(3);

        city.click();
        AllMethods.holdExecutionForSeconds(3);
        address.click();
        AllMethods.holdExecutionForSeconds(3);
         postalcode.click();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='cart-checkout']"));

    }
    public void nameemailareeditable(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        name.clear();
        AllMethods.holdExecutionForSeconds(3);
       name.sendKeys(CommonPage.properties.getProperty("name"));
        AllMethods.holdExecutionForSeconds(3);
        email.clear();
        AllMethods.holdExecutionForSeconds(3);
        email.sendKeys(CommonPage.properties.getProperty("email"));
        AllMethods.holdExecutionForSeconds(3);
        phonenumber.clear();
       AllMethods.holdExecutionForSeconds(3);
       phonenumber.sendKeys(CommonPage.properties.getProperty("number"));
        AllMethods.holdExecutionForSeconds(3);
       city.clear();
        AllMethods.holdExecutionForSeconds(3);
        city.sendKeys(CommonPage.properties.getProperty("city"));
       AllMethods.holdExecutionForSeconds(3);
        address.clear();
        AllMethods.holdExecutionForSeconds(3);
       address.sendKeys(CommonPage.properties.getProperty("address"));
       AllMethods.holdExecutionForSeconds(3);
        postalcode.clear();
       AllMethods.holdExecutionForSeconds(3);
        postalcode.sendKeys(CommonPage.properties.getProperty("postal"));
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='cart-checkout']"));

    }
    public void order(){
        BuyNow.click();
        AllMethods.holdExecutionForSeconds(3);
        Checkout.click();

    }


}