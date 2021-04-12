package homepageheader_hotels;

import common.WebAPI;
import org.testng.Assert;

import static homepageheader_hotels.HotelsWebElement.*;

public class HotelsSearchWithKeyword extends WebAPI {

    public void hotelsLink() throws InterruptedException {
        sleepFor(3);
        clickByXpath(hotelsLinkLocator);
    }

    public void whereToSearchBox(String location) throws InterruptedException {
        sleepFor(3);
        typeOnElementByXpathNEnter(whereToSearchBox, location);
    }

    public void hotelsButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(hotelsLocator);
    }

    public void verifyHotelsSearchResultPage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is a match");
    }

    public void clearSearchBox() throws InterruptedException {
        clickByXpath(searchBoxInputBox);
        sleepFor(3);
        clickById(clearField);
    }

    public void typeInSearchBox(String text) throws InterruptedException {
        sleepFor(3);
        typeByXpath(searchBoxInputBox,text);
    }

    public void searchButton(){
        clickById(searchButton);
    }
    public void verifyExpectedSearchResult(String expectedSearchResult){
        String actualSearchResults = getTextByXpath(queryResultText);
        Assert.assertEquals(actualSearchResults,expectedSearchResult,"Text is not a match");
    }




}
