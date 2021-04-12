package aetnahomepage_Provider;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import static aetnahomepage_Provider.ProvidersWebElement.*;

public class CovidProviderFAQ extends WebAPI {
    @FindBy(how = How.ID, using = userIdInputField)
    public WebElement userId;
    @FindBy(how = How.ID, using = passwordInputField)
    public WebElement passwordInput;
    @FindBy(how = How.ID, using = userNameInputField)
    public WebElement userName;
    @FindBy(how = How.ID, using = findStateResourcesDropdown)
    public WebElement stateDropdown;

    public void covidFAQSButton() {
        clickByXpath(covid19FAQButton);
    }

    public void vaccineFAQButton() {
        clickByXpath(vaccineFAQsButton);
    }

    public void vaccineQuestionTab() throws InterruptedException {
        windowHalfPageScroll();
        clickByXpath(questionTab);
        sleepFor(3);
    }

    public void verifyTheFirstSentenceOfQuestion(String expectedSentence) {
        String actualSentence = getTextByXpath(firstSentenceOfTheQUestion);
        Assert.assertEquals(actualSentence, expectedSentence, "Sentence is not a match");
    }

    public void availityLink() {
        clickByXpath(availityLink);
    }

    public void continueToSiteButton() throws InterruptedException {
        clickByXpath(continueToAvailitySiteButton);
        sleepFor(3);
        closeTheOldWindow();
    }

    public void invalidUserNameAndPassword(String userName, String password) {
        userId.sendKeys(userName);
        passwordInput.sendKeys(password);
    }

    public void showPasswordCheckbox() throws InterruptedException {
        clickByXpath(passwordCheckBox);
        sleepFor(3);
    }

    public void logInButton(){
        clickById(logInButton);
    }

    public void verifyLogInErrorMessage(String expectedErrorMessage){
        String actualErrorMessage = getTextByXpath(notFoundMessage);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Message is not a match");
    }

    public void cAQHLink() {
        clickByXpath(caqhLink);
    }

    public void continueToCAQHSiteButton() throws InterruptedException {
        clickByXpath(continueToCAQHSite);
        sleepFor(3);
        closeTheOldWindow();
    }

    public void enterInvalidUserName(String username) {
        userName.sendKeys(username);
    }

    public void forgotPasswordLink(){
        clickByXpath(forgotPasswordLink);
    }

    public void termsOfServiceCHeckBox(){
        clickById(termsAndConditionCheckbox);
    }

    public void hitContinue(){
        clickByXpath(continueButtons);
    }

    public void verifyForgotPasswordErrorMessage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void billingAndCodingFAQButton(){
        clickByXpath(billingAndCodingFAQSButton);
    }

    public void billingAndCodingQuestion() throws InterruptedException {
        windowHalfPageScroll();
        clickByXpath(billingAndCodingQuestionTab);
        sleepFor(3);
    }

    public void answerToBillingCodingQuestion(String expectedAnswer){
        String actualAnswer = getTextByXpath(answerToBillingANdCodingQuestion);
        Assert.assertEquals(actualAnswer, expectedAnswer, "Message is not a match");
    }

    public void telemedicineFAQsButton(){
        clickByXpath(telemedicineFAQButton);
    }
    public void telemedicineQUestionTab(){
        clickByXpath(temedicineQuestionTab);
    }

    public void coronavirusResourcePage(){
        clickByXpath(coronavirusResourcePageLink);
    }

    public void viewUpToDateVaccineDataFromTheCDCLink(){
        clickByXpath(viewUpToDateVaccineData);
    }

    public void continueToCDCLink() throws InterruptedException {
        clickByXpath(continueToVaccineData);
        sleepFor(3);
        closeTheOldWindow();
    }

    public void verifyCDCPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void patientCoverageFaqsButton(){
        clickByXpath(patientCoverageFAQsButton);
    }

    public void covidStateResourcesButton(){
        clickByXpath(covid19StateResources);
    }

    public void stateInputBoxDropdown(String state ){
        selectOptionByVisibleText(stateDropdown,state);
    }

    public void wisconsinVaccineInformatonLink(){
        clickByXpath(wisconsinVaccineInfoLink);
    }

    public void continueToWisconsinVaccineInformation() throws InterruptedException {
        clickByXpath(continueToWisconsinVaccineInfoSite);
        sleepFor(5);
        closeTheOldWindow();
    }

    public void verifyWisconsinVaccineInformationPageTitle(String expectedTitle){
        String actualTitle = getTextByXpath(wisconsinVaccineInformationPageTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void managementResourcesFaqsButton(){
        clickByXpath(managementResourcesFAQsButton);
    }

    public void caresActInformationForProvidersTab() throws InterruptedException {
        windowHalfPageScroll();
        clickByXpath(caresActInformationForProvidersTab);
        sleepFor(3);
    }

    public void caresActInformationForProvidersPDF(){
        clickByXpath(caresActInfoPDF);
    }

    public void verifycaresActInformationForProvidersPDFPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }



}
