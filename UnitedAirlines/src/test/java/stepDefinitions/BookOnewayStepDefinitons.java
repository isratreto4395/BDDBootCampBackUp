package stepDefinitions;

import common.WebAPI;
import homepageheader_book.BookOneWay;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class BookOnewayStepDefinitons extends WebAPI {
    static BookOneWay bookOneWay;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        bookOneWay = PageFactory.initElements(driver, BookOneWay.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I click on the OneWay button")
    public void i_click_on_the_one_way_button() {
        bookOneWay.oneWayButton();
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedResult) {
        bookOneWay.verifyFlightResultsPage(expectedResult);
    }
}
