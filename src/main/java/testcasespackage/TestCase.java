package testcasespackage;

import allmethods.AllMethods;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import setuppackage.Setup;

public class TestCase {
    public WebDriver driver;
    BuyNowpage BuyNowpage;
    CheckoutPage CheckoutPage;
    CommonPage CommonPage;
    CreditDebitPage CreditDebitPage;
    PaynowPage PaynowPage;
    PromoCodePage PromoCodePage;
    TransactionPage TransactionPage;
    OrderSummaryPage OrderSummaryPage;

    @BeforeClass(alwaysRun = true)
    public void tearUp() {
        driver = Setup.LaunchBrowser("chrome");
        driver.get("https://demo.midtrans.com/");

        BuyNowpage = new BuyNowpage(driver);
        CheckoutPage = new CheckoutPage(driver);
        CommonPage = new CommonPage(driver);
        CreditDebitPage = new CreditDebitPage(driver);
        PaynowPage = new PaynowPage(driver);
        PromoCodePage = new PromoCodePage(driver);
        TransactionPage = new TransactionPage(driver);
        OrderSummaryPage = new OrderSummaryPage(driver);


    }
    @AfterMethod(alwaysRun = true)
    public void teardown(){
        driver.get("https://demo.midtrans.com/");
    }

    @Test(priority =14,groups={"regression"})
    public void buynowtestcaseone() {
        BuyNowpage.buynow();
        Assert.assertTrue(AllMethods.isDisplayedElement("//td[normalize-space()='Midtrans Pillow']"));
        Assert.assertTrue(AllMethods.isDisplayedElement("//input[@value='20000']"));


    }

    @Test(priority =13,groups={"regression"})
    public void buynowtestcasetwo() {
        BuyNowpage.checkoutpopup();
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='cart-checkout']"));


    }

    @Test(priority =12,groups={"regression"})
    public void checkoutone() {
        CheckoutPage.verifynameemailoncheckoutpage();
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='cart-checkout']"));

    }

    @Test(priority =11,groups={"regression"})
    public void checkoutpagetwo() {
       CheckoutPage.nameemailareeditable();
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='cart-checkout']"));
    }

    @Test(priority =10,groups={"regression"})
    public void ordersummaryone() {
        CheckoutPage.order();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().defaultContent();
        AllMethods.holdExecutionForSeconds(3);

    }

    @Test(priority =9,groups={"regression"})
    public void ordersummarytwo() {
        OrderSummaryPage.product();
        AllMethods.holdExecutionForSeconds(3);
        driver.switchTo().frame(0);
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//span[@class='item-name']"));
        Assert.assertTrue(AllMethods.isDisplayedElement("//td[@class='table-amount text-body']"));

        Assert.assertTrue(AllMethods.isDisplayedElement("//a[@class='button-main-content']"));

    }

    @Test(priority =8,groups={"regression"})
    public void ordersummarythree() {
        OrderSummaryPage.clickoncontinue();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));
    }

    @Test(priority = 7,groups={"regression"})
    public void creditdebitone() {
        CreditDebitPage.creditdebitclick();
        AllMethods.holdExecutionForSeconds(3);
        Assert.assertTrue(AllMethods.isDisplayedElement("//div[@class='amount']"));
    }

    @Test(priority = 6,groups={"regression"})
    public void credidebittwo() {
        CreditDebitPage.entercarddetails();
        AllMethods.holdExecutionForSeconds(10);
        Assert.assertTrue(AllMethods.isDisplayedElement("//p[@class='text-page-title-content']"));


    }
@Test(priority = 5,groups={"regression"})
    public void paynowtestcase(){
    PaynowPage.paynow();
}

@Test(priority = 4,groups={"regression"})
    public  void transactionone(){
    TransactionPage.clickoncanelbutton();
}

@Test(priority=3,groups={"regression"})
    public void transactiontwo(){
        TransactionPage.invalidotp();
}

@Test(priority=2,groups={"regression"})
    public void transactionthree(){
        TransactionPage.okbuttonvalidotp();

}
@Test(priority=1,groups = {"regression"})
    public void promocode(){
        PromoCodePage.Promo();
}

}