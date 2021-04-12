package stepDefinitions;

import common.WebAPI;
import homepageheader_hotels.Register;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class RegisterStepDefinition extends WebAPI {
    static Register register;
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        register= PageFactory.initElements(driver,Register.class);
    }

    //@After
    public void closeBrowser(){
        cleanUp();
    }

//    @Given("I click on the signIn button")
//    public void i_click_on_the_sign_in_button() {
//       register.signInButton();
//    }
    @Given("I click on the continue with email button")
    public void i_click_on_the_continue_with_email_button() throws InterruptedException {
        register.continueWithEmailButton();
    }
    @When("I enter user information from the table")
    public void i_enter_user_information_from_the_table(List<List<String>> table) {
        Map<String, String> map = TableDictionaryConverter(table);
        register.enterUserInformation(map.get("Email"),map.get("CreateAPassword"));
    }
    @Then("I click on the join button")
    public void i_click_on_the_join_button() {
     register.joinButton();
    }
//    @When("I click on the become a member button")
//    public void i_click_on_the_become_a_member_button() {
//       register.becomeAMemberButton();
//    }
    @Then("I verify the text {string} as the title")
    public void i_verify_the_text_as_the_title(String expectedTitle) {
        register.verifyBecomeAMemberBoxTitle(expectedTitle);
    }
}
