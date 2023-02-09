package newSample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends CommonPageElements{

    @FindBy(xpath = "//p[.='Home']")
    public WebElement homeBtn;
}
