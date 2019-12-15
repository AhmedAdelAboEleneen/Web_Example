package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    public WebDriver driver;
    public JavascriptExecutor jse;
    public Select select;

    // create constructor
    public PageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

}
