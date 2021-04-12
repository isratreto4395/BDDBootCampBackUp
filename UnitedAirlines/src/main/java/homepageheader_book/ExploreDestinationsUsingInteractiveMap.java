package homepageheader_book;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;

import static homepageheader_book.BookWebElement.*;

public class ExploreDestinationsUsingInteractiveMap extends WebAPI {
    @FindBy(how = How.XPATH, using = SEARCH_TYPE)
    public WebElement search_type;
    @FindBy(how = How.XPATH, using = SEARCH_CONFIRM)
    public WebElement search_confirm;
    @FindBy(how = How.XPATH, using = searchButton)
    public WebElement search;
    @FindBy(how = How.ID, using = searchType)
    public WebElement searchtype;
    @FindBy(how = How.XPATH, using = specificDatesLocator)
    public WebElement specificDates;
    @FindBy(how = How.XPATH, using = listOfSearchResultsText)
    public WebElement listOfSearch;
    @FindBy(how = How.XPATH, using = filterOptions)
    public WebElement filteredOptions;

    public void fromButton() throws InterruptedException {
        clickById(fromLocationButton);
        sleepFor(3);
        backSpaceById(fromLocationButton, 15);
    }

    public void fromDepartField(String location) throws InterruptedException {
        sleepFor(3);
        typeById(fromLocationButton, location);
    }

    public void maxPrice() {
        clickById(maxPrice);
    }

    public void maxPriceInput(String price) {
        typeById(maxPrice, price);
        windowHalfPageScroll();
    }

    public void searchButton() throws InterruptedException {
        windowsFullPageScrollSideBar(search);
        sleepFor(5);
    }

    public void verifyListsResultsText(String expectedText) {
        String actualText = getTextByXpath(listOfSearchResultsText);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");
    }

    public void searchTypeButton() throws InterruptedException {
//        clickById(searchType);
//        sleepFor(5);
//
        searchtype.sendKeys(Keys.ARROW_DOWN);
        sleepFor(3);
        search_type.sendKeys(Keys.ENTER);

        //clickByXpath(specificDatesLocator);

//        List<WebElement> opt = driver.findElements(By.id(searchType));
////        int s = opt.size();
//        // Iterating through the list selecting the desired option
//        for (int j = 0; j < opt.size(); j++) {
//            // if the option is By Subject click that option
//            if (opt.get(j).getText().equals("Specific dates")) {
//                opt.get(j).click();
//                break;
//            }
        //}




//   search_type.click();
//   sleepFor(5);
//   search_confirm.click();





    }

    public void filteredDepartDate(String departDate) {
        clickById(filteredDepartDate);
        typeById(filteredDepartDate, departDate);
    }

    public void filteredReturnDate(String returnDate) throws InterruptedException {
        typeOnElementByIdNEnter(filteredReturnDate, returnDate);
        sleepFor(3);
        windowsFullPageScrollSideBar(search);
    }

    public void filterByInterestButton() {
        clickByXpath(filterByInterestButton);
    }

    public void filterOptions() throws InterruptedException {
        sleepFor(3);
        checkWebElementsByXpath(filterOptions);
    }

    public void applyFilter() {
        clickByXpath(applyFiltersButton);
    }

    public void verifyFilterResultsText(String expectedText) {
        String actualText = getTextByXpath(filterByInterestAmount);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");

    }
}

