package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class MidtransPage extends CommonPage {
    public MidtransPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
