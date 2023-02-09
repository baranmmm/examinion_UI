package newSample.step_definitions;

import io.cucumber.java.en.When;
import newSample.utilities.CommonSteps;

public class StudentsStepDefs extends CommonSteps {

    @When("the user clicks on {string} option under Users sidebar")
    public void the_user_clicks_on_option_under_users_sidebar(String sidebarOption) {
        studentsPage.goToSidebarOption("Users");
        waitForVisibility(studentsPage.getSidebarOption(sidebarOption), 10);
        studentsPage.goToSidebarOption(sidebarOption);
    }
}
