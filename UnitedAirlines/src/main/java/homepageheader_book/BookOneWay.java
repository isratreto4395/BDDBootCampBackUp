package homepageheader_book;

import common.WebAPI;
import org.testng.Assert;

import static homepageheader_book.BookWebElement.*;

public class BookOneWay extends WebAPI {

    public void oneWayButton(){
        clickByXpath(oneWayLocator);
    }
    public void verifyFlightResultsPage(String expectedResult){
        String actualResult = getTextByXpath(pageResutlText);
        Assert.assertEquals(actualResult,expectedResult,"Text is not a match");
    }
}
