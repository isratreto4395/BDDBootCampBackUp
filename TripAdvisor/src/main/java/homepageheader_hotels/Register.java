package homepageheader_hotels;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static homepageheader_hotels.HotelsWebElement.*;

public class Register extends WebAPI {
    @FindBy(how = How.ID, using = emailAddressInputBox)
    public WebElement emailAddress;
    @FindBy(how = How.ID, using = passwordInputBox)
    public WebElement passwordInput;

    public void signInButton() {
        clickByXpath(signInLocator);
    }

    public void continueWithEmailButton() throws InterruptedException {
        sleepFor(5);
        clickByXpath(continueWithEmailButton);
        sleepFor(4);
    }

    public void enterUserInformation(String email, String password) {
        emailAddress.sendKeys(email);
        passwordInput.sendKeys(password);
    }
    public void joinButton(){
        clickByXpath(joinButton);
    }

    public void becomeAMemberButton() {
        clickByXpath(becomeAMemberButton);
    }

    public void verifyBecomeAMemberBoxTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(becomeAMemberBoxTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

}
