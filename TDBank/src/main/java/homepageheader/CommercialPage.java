package homepageheader;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader.HomePageHeaderWebElement.*;

public class CommercialPage extends WebAPI {
    @FindBy(how = How.XPATH, using = lendingButtonLocator)
    public WebElement lendingButton;
    @FindBy(how = How.XPATH, using = commercialLendingOption)
    public WebElement commercialLending;
    @FindBy(how = How.XPATH, using = treasuryServicesButtonLocator)
    public WebElement treasuryServices;
    @FindBy(how = How.XPATH, using = payablesOption)
    public WebElement payables;
    @FindBy(how = How.XPATH, using = industriesButtonLocator)
    public WebElement industries;
    @FindBy(how = How.XPATH, using = educationOption)
    public WebElement education;
    @FindBy(how = How.ID, using = firstNameInputBox)
    public WebElement firstName;
    @FindBy(how = How.ID, using = lastNameInputBox)
    public WebElement lastName;
    @FindBy(how = How.ID, using = businessNameInputBox)
    public WebElement businessName;
    @FindBy(how = How.ID, using = phoneNumberInputBox)
    public WebElement phone;
    @FindBy(how = How.ID, using = emailInputBox)
    public WebElement email;
    @FindBy(how = How.ID, using = firstNameInputField)
    public WebElement firstNameInput;
    @FindBy(how = How.ID, using = lastNameInputField)
    public WebElement lastNameInput;
    @FindBy(how = How.ID, using = emailInputField)
    public WebElement emailInput;
    @FindBy(how = How.ID, using = companyInputField)
    public WebElement companyInput;
    @FindBy(how = How.ID, using = phoneInputField)
    public WebElement phoneInput;
    @FindBy(how = How.XPATH, using = sectorDropDown)
    public WebElement sector;
    @FindBy(how = How.ID, using = questionInputField)
    public WebElement questionSearchBox;

    public void adsChoicesAndPersonalizationpopUp() {
        clickByXpath(adChoicesAndPersonalizationXButton);
    }

    public void commercialTab() {
        clickByLinkText(commercialTabLocator);
    }

    public void hoverOverLendingAndSelectCommerical() {
        hoverAndClick(lendingButton, commercialLending);
    }

    public void verifyCommercialLendingPage(String expectedText) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title does not match");
    }

    public void requestACall() {
        clickByXpath(requestACallButton);
    }

    public void enterPersonalInformation(String firstname, String lastname, String businessname, String phoneNumber, String emailAddress) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        businessName.sendKeys(businessname);
        phone.sendKeys(phoneNumber);
        email.sendKeys(emailAddress);
    }

    public void areYouATDCustomer() {
        clickByXpath(tDCustomer);
    }

    public void verifyHeaderOnTheScheduleAppointmentPage(String expectedText) {
        String actualText = getTextByXpath(scheduleAnAppointmentPageHeader);
        Assert.assertEquals(actualText, expectedText, "Header does not match");
    }

    public void learnMoreButton() throws InterruptedException {
        clickByLinkText(learnMoreButton);
        sleepFor(3);
    }

    public void verifyFlexibleLendingOptions(String expectedText) {
        String actualText = getTextByXpath(learnMoreOptionsText);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void tdGlobalTradeFinanceGetDetailsButton() {
        clickByXpath(tdGlobalTradeFinanceLocator);
    }

    public void tdInvestorRelationsLink() {
        clickByXpath(visitTDInvestorRelationLink);
    }

    public void verifyTheInvestorRelationsPageTitle(String expectedTitle) {
        String actualText = getTextByXpath(investorRelationsPageTitle);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void signUpForALerts() {
        clickByXpath(signUpForAlerts);
    }

    public void personalInfoFieldOnGetNewsAlerts(String firstName, String lastName, String companyName, String emailAddress, String phoneNumber) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(emailAddress);
        companyInput.sendKeys(companyName);
        phoneInput.sendKeys(phoneNumber);
    }

    public void sectorDropDown(String sectorOption) {
        selectOptionByVisibleText(sector, sectorOption);
    }

    public void verifyGetNewsAlertsTitle(String expectedTitle) {
        String actualText = getTextByXpath(getNewsAlertsTitle);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void awardWinningButton() {
        clickByXpath(awardWinningButton);
    }

    public void verifySectionTitle(String expectedTitle) {
        String actualText = getTextByXpath(pageSectionTitlePresentationEvents);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void hoverOverTreasuryServices() {
        hoverAndClick(treasuryServices, payables);
    }

    public void tdInformationServicesGetDetailsButton() {
        clickByXpath(tdInformationServicesGetDetailsButton);
    }

    public void tdeTreasuryLink() {
        clickByXpath(learMoreAboutTDeTreasuryLink);
    }

    public void clickTranscript() throws InterruptedException {
        clickByXpath(transcript);
        sleepFor(3);
    }

    public void verifyTranscript(String expectedText) {
        String actualText = getTextByXpath(transcriptText);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    public void hoverOverIndustries() {
        hoverAndClick(industries, education);
    }

    public void verifyPageTitle(String expectedTitle) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedTitle, "Text does not match");

    }

    public void assetBasedLendingIcon() {
        clickByXpath(assetBasedLendingIcon);
    }

    public void verifyTitle(String expectedTitle) {
        String actualText = getTextByXpath(assetBasedLendingLearnMoreText);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void loansAndCreditsIcon() {
        clickByXpath(loansOfCreditIcon);
    }

    public void commercialMortgageLink() throws InterruptedException {
        clickByXpath(commercialMortgageLink);
        sleepFor(3);
    }

    public void navigateBackToTDCommericalAndCorporateLendingWindow() throws InterruptedException {
        changeToOldWindow();
        sleepFor(3);
    }

    public void fraudControlIcon() {
        clickByXpath(fraudControlIcon);
    }

    public void fraudItemsYouMightNotKnowLink() {
        clickByLinkText(fraudItemsYouMightNotKnowLink);
    }

    public void verifyThePageTitleOfTheLink(String expectedTitle) {
        String actualText = getTextByXpath(fraudItemsYouMightNotKnowPageTitle);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void equipmentFinanceIcon() {
        clickByXpath(equipmentFinanceIcon);
    }

    public void verifyTheFinancePageTitle(String expectedTitle) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void exploreTDBankingOfferingsByIndustryLink() {
        clickByXpath(tdBankOfferingLinkLocator);
        windowTwoThirdPageScroll();
    }

    public void growingBusinessLink() {

        clickByXpath(growingBusinessLink);
    }

    public void verifyGrowingBusinessPageTitle(String expectedTitle) {
        String actualText = getTextByXpath(growingBusinessLinkPageTitle);
        Assert.assertEquals(actualText, expectedTitle, "Title does not match");
    }

    public void enterAQuestion(String question) throws InterruptedException {
        questionSearchBox.sendKeys(question);
        sleepFor(3);
    }

    public void askNowButton() throws InterruptedException {
        clickByXpath(askNowButton);
        sleepFor(3);
    }

    public void verifySearchResult(String expectedQuestion){
    String actualQuestion = getTextByCss(searchedQuestionLocator);
    Assert.assertEquals(actualQuestion,expectedQuestion, "Question is not a match");
    }

    public void verifySearchResultIsNotAMatch(String expectedQuestion){
        String actualQuestion = getTextByCss(searchedQuestionLocator);
        Assert.assertNotEquals(actualQuestion,expectedQuestion,"Product does match");
    }


}
