package pages;



import setuppackage.Setup;
import allmethods.AllMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonPage  extends Setup {
    WebDriver driver;
    public  static Properties properties;
    public  static FileInputStream fis;
    public CommonPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
        properties=new Properties();
        try{
            fis= new FileInputStream("Resources/config.properties");
            properties.load(fis);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}






   

