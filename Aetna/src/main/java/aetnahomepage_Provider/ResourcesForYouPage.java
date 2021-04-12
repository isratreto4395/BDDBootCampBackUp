package aetnahomepage_Provider;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static aetnahomepage_Provider.ProvidersWebElement.*;

public class ResourcesForYouPage extends WebAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    @FindBy(how = How.ID, using = languageDropdown)
    public WebElement language;

    public void resourcesForYouButton() {
        clickByXpath(resourcesForYouButton);
    }

    public void cdcIssuesGuidelineForVaccinatedIndividualsLink() throws InterruptedException {
        sleepFor(3);
        clickByXpath(cdcIssueGuideline);
    }

    public void continueToCDCGuidelineLink() throws InterruptedException {
        clickByXpath(continueToCovidCDC);
        sleepFor(3);
        closeTheOldWindow();
    }

    public void verifyCDCPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void searchATopic(String topic) {
        typeOnElementByIdNEnter(headerSearchLocator, topic);
    }

    public void verifySearchResult(String expectedText) {
        String actualText = getTextByXpath(searchItem);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");
    }

    public void verifySearchResultNotMatch(String expectedtext) {
        String actualText = getTextByXpath(searchItem);
        Assert.assertNotEquals(actualText, expectedtext, "Text is a match");
    }

    public void verifySearchPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertNotEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void advancedSearchButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(advancedSearchLocator);
    }

    public void searchTopic(String topic) {
        typeByXpath(advancedSearchBoxLocator, topic);
    }

    public void allTheseWordsInputBox(String topic) {
        typeById(allTheseWordsInputBox, topic);
    }

    public void thisExactWordOrPhraseInputBox(String topic) {
        typeById(thisExactWordOrPhraseInputBox, topic);
    }

    public void anyOfTheseWordsInputBox(String topic) {
        typeById(anyOfTheseWordsInputBox, topic);
    }

    public void noneOfTheseWordsInputBox(String topic) {
        typeById(noneOfTheseWordsInputBox, topic);
    }

    public void languageDropdown(String languageOption) {
        selectOptionByVisibleText(language, languageOption);
    }

    public void fromDateToDate(String fromDate, String toDate) throws InterruptedException {
        typeByXpath(from, fromDate);
        typeOnElementByXpathNTab(to, toDate);
        sleepFor(3);
    }

    public void searchButton() throws InterruptedException {

        clickById(searchButton);
        sleepFor(5);
    }

    public void otherLanguagesLink() {
        clickByXpath(otherLanguagesLink);
    }

    public void verifyOtherLanguagesPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void filterByLanguageDropdownAndSelectLanguage() throws InterruptedException {
        clickByXpath(filterByLanguageDropdown);
        clickByCss(languages);
        sleepFor(3);
    }
    public void languagePageSearchBox(String searchText) {
        typeOnElementByIdNEnter(filterByLanguagesearchButton, searchText);
    }
    public void verifyResultMessage(String expectedMessage){
        String actualMessage = getTextByXpath(resultSearchText);
        Assert.assertEquals(actualMessage,expectedMessage,"Result Message does not match");
    }

    public void filterByLanguageDropdown(){
        clickByXpath(filterByLanguageDropdown);
    }
    public void storeLanguageOptionsInMySQL(){
        List<String> languageOptions = getTextFromWebElementsByXpath(filterByLanguageOption);
        connectToSqlDB.insertDataFromArrayListToSqlTable(languageOptions,"languages","options");
    }

    public void verifyLanguageOptionsUsingMySqlDatabase(){

    }


    public void communityStrategyToAddressInequitiesLink(){
        clickByXpath(communityStrategyToAddressInequities);
    }
    public void continueToCVSSite() throws InterruptedException {
        clickByXpath(contniueToCVSSite);
        sleepFor(3);
        closeTheOldWindow();
    }
    public void verifyCVSHealthPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void cvsHealthExpandsAccessToVaccinesLink(){
        clickByXpath(cvsHealthexpandsaccesstovaccinesLink);
    }




}
