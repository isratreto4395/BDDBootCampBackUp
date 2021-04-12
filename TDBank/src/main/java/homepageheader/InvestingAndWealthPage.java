package homepageheader;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader.HomePageHeaderWebElement.*;

public class InvestingAndWealthPage extends WebAPI {
    @FindBy(how = How.XPATH, using = financialGoalsLocator)
    public WebElement financialGoals;
    @FindBy(how = How.XPATH, using = preserveYourWealthOption)
    public WebElement preserveYourWealth;
    @FindBy(how = How.XPATH, using = findAStoreSearchBox)
    public WebElement findAStore;
    @FindBy(how = How.XPATH,using = solutionsLocator)public WebElement solutions;
    @FindBy(how = How.XPATH,using = corporateAndNotForProfitOption)public WebElement corporateAndNotForProfit;
    @FindBy(how = How.XPATH,using = zipCodeButton)public WebElement zipCode;

    public void investingAndWealthTab() {
        clickByLinkText(investingAndWealthTabLocator);
    }

    public void hoverOverFinancialGoalsAndSelectPreserveWealth() throws InterruptedException {
        sleepFor(3);
        hoverAndClick(financialGoals, preserveYourWealth);
    }

    public void verifyPreserveWealthPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void investmentManagementFindOutMoreLink() {
        clickByXpath(investmentAndManagementfindOutMoreLink);
    }

    public void ourProcessTab() {
        clickByXpath(ourProcesTab);
    }

    public void verfiyOurProcessTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(ourProcessTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void individualsAndFamilies() {
        clickByXpath(individualAndFamiliesIcon);
    }

    public void findATDBankLocation() {
        clickByXpath(findATDBankButton);
    }

    public void findAStoreSearchBox(String state) throws InterruptedException {
        findAStore.sendKeys(state, Keys.ENTER);
        sleepFor(3);
    }

    public void verifySearchedState(String expectedState) {
        String actualState = getTextByXpath(resultSummaryText);
        Assert.assertEquals(actualState, expectedState, "Wrong state is displayed");
    }

    public void businessOwner() throws InterruptedException {
        sleepFor(3);
        clickByXpath(businessOwnersIcon);
    }

    public void privateBankingLink() {
        clickByXpath(privateBankingLink);
    }

    public void paymentSolutionTab() {
        clickByXpath(paymentSolutionsTab);
    }

    public void verifyPaymentSolutionTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(paymentSolutionsTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is wrong");
    }

    public void retirementAndWealthPlanning() {
        clickByXpath(retirementPlanningIcon);
    }

    public void legacyAndPhilanthropicPlanningLink() {
        clickByXpath(legacyAndPhilanthropicPlanningLink);
    }

    public void watchVideoButton() {
        clickByXpath(watchVideoButton);

    }

    public void transcriptButton() throws InterruptedException {
        clickByXpath(transcript);
        sleepFor(3);
    }

    public void verifyFirstSenenteceOfTheTranscript(String expectedText) {
        String actualText = getTextByXpath(transcriptFirstText);
        Assert.assertEquals(actualText, expectedText, "First sentence is incorrect");
    }

    public void tdAmeritradeIcon() throws InterruptedException {
        sleepFor(3);
        clickByXpath(tDAmericanIcon);
    }

    public void tdAmeritradeEducationStartLearningButton() {
        clickByXpath(tDAmeritradeEducationPage);
    }

    public void continueToSiteButton() {
        clickByXpath(continueToSiteButton);
    }

    public void tDAmeritradePageInANewWindow() throws InterruptedException {
        sleepFor(3);
        closeTheOldWindow();
        sleepFor(3);
    }

    public void verifyTheTDAmeritradeLogo(String expectedHeader) {
        String actualHeader = getTextByXpath(tDAmeritradeHeader);
        Assert.assertEquals(actualHeader, expectedHeader, "Header does not match");
    }

    public void hoverOverSolutionsLink() throws InterruptedException {
        sleepFor(3);
        hoverAndClick(solutions,corporateAndNotForProfit);
    }

    public void corporateRateTrustTab() throws InterruptedException {
        clickByXpath(corporateTrustTab);
        sleepFor(3);
    }

    public void verifyCoporateTrustTitle(String expectedTitle){
        String actualTitle = getTextByXpath(corporateTrustTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void insightsLink(){
        clickByXpath(insightsLocator);
    }

    public void retirementLink(){
        clickByXpath(retirement101Page);
        closeTheOldWindow();
    }

    public void zipCodeBox() throws InterruptedException {
        //windowsFullPageScrollSideBar(zipCode);
        sleepFor(3);
        clickByXpath(zipCodeButton);
    }

    public void openInNewWindowButton(){
        clickByXpath(iframeWindowButton);
    }

    public void enterZipCode(){
        closeTheOldWindow();
        typeByXpath(zipCodeInputField,zipCodeInput);
    }

    public void submitButton(){
        clickByXpath(submitButton);
    }

    public void verifySubmissionResult(String expectedSubmissionResponse){
        String actualSubmissionResponse = getTextByXpath(confirmationMessage);
        Assert.assertEquals(actualSubmissionResponse,expectedSubmissionResponse,"Submission text does not match");
    }

    public void exploreYourOptionButton(){
        clickByXpath(exploreYourOptionsButton);
    }

    public void successPlanningLearnMoreButton() throws InterruptedException {
        clickByXpath(successfulPlanningLearnMoreButton);
        sleepFor(3);
    }

    public void verifyBusinessSuccessionPlanningTitle(String expectedTitle){
        String actualTitle = getTextByXpath(businessSuccessionPlanningTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void regBIDisclosureBrochurePDF(){
        clickByXpath(regBIDisclosureBrochurePDFLocator);
    }

    public void verifyThePdfTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }






}






