package aetnahomepage_Provider;

import common.WebAPI;
import org.testng.Assert;

import static aetnahomepage_Provider.ProvidersWebElement.*;

public class ProvidersHomePage extends WebAPI {

    public void providersLink() throws InterruptedException {
        sleepFor(3);
        clickByXpath(providersLocator);
    }
    public void viewProviderUpdateVideo(){
    clickByXpath(viewProviderUpdateVideoLink);
    }
    public void continueButton(){
        clickByXpath(continueButton);
    }
    public void verifyyouTubeVideoTitle(String expectedTitle){
        closeTheOldWindow();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void closeAlert() throws InterruptedException {
        clickByXpath(closeAlertButton);
        sleepFor(3);
    }
    public void verifyProvidersPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void exploreHealthCareResourcesLink(){
        clickByXpath(manualsWebinarsAndMoreLinkLocator);
    }
    public void verifyManualsAndWebinarsPageTitle(String expectedTitle){
        String actualTitle = getTextByXpath(manualsAndWebinarsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void readProviderNewslettersLink(){
        clickByXpath(newsletters);
    }
    public void verifyNewslettersLink(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void findRegulationsByStateLink(){
        clickByXpath(stateRegulations);
    }

    public void verifyStateRegulationsTitle(String expectedTitle){
        String actualTitle = getTextByXpath(stateRegulationsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void learnAboutDisputesAndAppealsLink(){
        clickByXpath(disputesAndAppeals);
    }

    public void verifydisputesAndAppealsPageTitle(String expectedTitle){
        String actualTitle = getTextByXpath(disputesAndAppealsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void rightClickPaymentSolutionToOpenNewWindow() throws InterruptedException {
        sleepFor(3);
        rightClickandOpenTabXPATH(paymentAndClaimsLink);
       sleepFor(3);
        closeTheOldWindow();
    }
    public void exploreClaimsOptions(){
        clickByXpath(exploreClaimsOptions);
    }
    public void verifyExploreClaimsOptionsPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void submitClaimsThroughAvaility(){
        clickByXpath(submitClaimsThroughAvailityLink);
    }
    public void continueToAvailitySite() throws InterruptedException {
        clickByXpath(continueToAvailitySite);
        sleepFor(3);
        closeTheOldWindow();
    }
    public void availitySitePop() throws InterruptedException {
        sleepFor(3);
        clickByXpath(availitySitePopUpAnswer);
        sleepFor(3);
    }
    public void verifyAvailitySitePageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void precertificationButton(){
        clickByXpath(precertificationButton);
    }
    public void searchBoxField(String code) throws InterruptedException {
        sleepFor(3);
        typeOnElementByXpathNEnter(codeInputField1,code);
    }
  public void iAcceptButton(){
        clickByXpath(iAcceptButton);
  }
    public void cptCodesSearched(String expectedCode){
        String actualCode = getTextByXpath(expectedCode);
        Assert.assertEquals(actualCode,expectedCode,"Code is not a match");

    }
    public void verifyCodeSearchTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }
    public void searchBoxField1(String code) throws InterruptedException {
        sleepFor(3);
        typeByXpath(codeInputField1,code);
    }

    public void searchBoxField2(String code) throws InterruptedException {
        sleepFor(3);
        typeByXpath(codeInputField2,code);
    }
    public void searchBoxField3(String code) throws InterruptedException {
        sleepFor(3);
        typeByXpath(codeInputField3,code);
    }
    public void searchBoxField4(String code) throws InterruptedException {
        sleepFor(3);
        typeByXpath(codeInputField4,code);
    }
    public void searchBoxField5(String code) throws InterruptedException {
        sleepFor(3);
        typeOnElementByXpathNEnter(codeInputField5,code);
    }



}
