package newSample.pages;

import newSample.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPageElements{

    @FindBy(id = ":r0:")
    public WebElement emailTxt;

    @FindBy(id = "auth-login-v2-password")
    public WebElement passwordTxt;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginBtn;

    public void loginAsSuperAdmin(){
        driver.get(ConfigurationReader.get("url"));
        emailTxt.sendKeys(ConfigurationReader.get("superadminUsername"));
        passwordTxt.sendKeys(ConfigurationReader.get("superadminPassword"));
        loginBtn.click();
    }

    public void loginAsStudent(){
        driver.get(ConfigurationReader.get("url"));
        emailTxt.sendKeys(ConfigurationReader.get("studentUsername"));
        passwordTxt.sendKeys(ConfigurationReader.get("studentPassword"));
        loginBtn.click();
    }


}
