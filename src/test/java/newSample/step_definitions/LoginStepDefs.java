package newSample.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newSample.utilities.CommonSteps;
import newSample.utilities.ConfigurationReader;
import org.junit.Assert;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class LoginStepDefs extends CommonSteps {

    @Given("the user goes to examinion home page")
    public void the_user_goes_to_examinion_home_page() {
        driver.get(ConfigurationReader.get("url"));
    }

    @Then("the user should be able to login to the platform")
    public void the_user_should_be_able_to_login_to_the_platform() throws IOException {
        waitForVisibility(dashboardPage.homeBtn, 10);
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

    }

    @When("the user provides correct {string} credentials")
    public void the_user_provides_correct_credentials(String role) {
        if(role.equalsIgnoreCase("student")){
            loginPage.emailTxt.sendKeys(ConfigurationReader.get("studentUsername"));
            loginPage.passwordTxt.sendKeys(ConfigurationReader.get("studentPassword"));
            loginPage.loginBtn.click();
        }else if(role.equalsIgnoreCase("superadmin")){
            loginPage.emailTxt.sendKeys(ConfigurationReader.get("superadminUsername"));
            loginPage.passwordTxt.sendKeys(ConfigurationReader.get("superadminPassword"));
            loginPage.loginBtn.click();
        }
    }

    @Given("the user logs in to the platform as {string}")
    public void theUserLogsInToThePlatformAs(String role) {
        if(role.equalsIgnoreCase("student")){
            loginPage.loginAsStudent();
        }else if(role.equalsIgnoreCase("superadmin")){
            loginPage.loginAsSuperAdmin();
        }
    }
}
