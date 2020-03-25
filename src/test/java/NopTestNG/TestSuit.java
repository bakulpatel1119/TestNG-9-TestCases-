package NopTestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    BookCategoryComparisionPage bookCategoryComparisionPage = new BookCategoryComparisionPage();
    BookCategoryComparisionResultPage bookCategoryComparisionResultPage = new BookCategoryComparisionResultPage();
    RegisteredUserReferetoFreiend registeredUserReferetoFreiend = new RegisteredUserReferetoFreiend();
    RegisteredUserReferToAFriendResultPage registeredUserReferToAFriendResultPage = new RegisteredUserReferToAFriendResultPage();
    NonRegisteredReferToAFriend nonRegisteredReferToAFriend = new NonRegisteredReferToAFriend();
    NonRegisteredReferToAFreinedResultPage nonRegisteredReferToAFreinedResultPage = new NonRegisteredReferToAFreinedResultPage();
    CategoryPagePriceHighToLow categoryPagePriceHighToLow = new CategoryPagePriceHighToLow();
    CategoryPagePriceHighToLowResultPage categoryPagePriceHighToLowResultPage = new CategoryPagePriceHighToLowResultPage();
    GuestComments guestComments = new GuestComments();
    GuestCommentsResults guestCommentsResults = new GuestCommentsResults();
    AddtoCartFeatureProducts addtoCartFeatureProducts = new AddtoCartFeatureProducts();
    AddtoCartForFeaturedProductsResultPage addtoCartForFeaturedProductsResultPage = new AddtoCartForFeaturedProductsResultPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    ChangeCurrencyResultPage changeCurrencyResultPage = new ChangeCurrencyResultPage();
    GuestCheckOut guestCheckOut = new GuestCheckOut();
    GuestCheckoutResultPage guestCheckoutResultPage = new GuestCheckoutResultPage();

    /////////////////////////////////////////////////////  PROGRAMME 1 /////////////////////////////////////////////////
    @Test
    public void guestUserShouldBeAbleToCheckOutSuccessfully()
    {
        browserSelector.openBrowser();
        // Enter details for checkout
        guestCheckOut.enterDetailsForCheckout();
        //verify guest user can see check out successful message
        guestCheckoutResultPage.verifyCheckoutSuccessfulMessage();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 2 /////////////////////////////////////////////////
    @Test
    public void userShouldBeAbleToCompareTwoProductSuccessfully()
    {
        browserSelector.openBrowser();
        // select product to compare
        bookCategoryComparisionPage.selectProductsToCompare();
        // user should be able to compare two products successfully
        bookCategoryComparisionResultPage.usershouldseeComparisionResult();
        browserSelector.quitBrowser();
    }
    //////////////////////////////////////////////////////  PROGRAMME 3 ////////////////////////////////////////////////
    @Test
    public void userShouldAbletoRegisterSuccessfully()
    {
        browserSelector.openBrowser();
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.userEnterRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        browserSelector.quitBrowser();
    }    /////////////////////////////////////////////////////  PROGRAMME 4 /////////////////////////////////////////////////
    @Test
    public void nonRegisteredUserShouldNotBeAbleToReferProductToAFriend()
    {
        browserSelector.openBrowser();
        //select product refer to a Friend
        nonRegisteredReferToAFriend.nonRegisteredUserSelectProdutToReferToaFriend();
        //Non registered should no be able to refer product to a Friend
        nonRegisteredReferToAFreinedResultPage.nonRegisteredUserShouldNotbeAbleToReferToAFriend();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 5 ////////////////////////////////////////////////
   @Test
    public void userShouldBeAbleToSortPriceHighToLow()
   {
       browserSelector.openBrowser();
        //soft price high to low
        categoryPagePriceHighToLow.sortPriceHighToLow();
        //verify user should be able to sort price high to low
        categoryPagePriceHighToLowResultPage.verifyPriceSortedHightoLow();
       browserSelector.quitBrowser();
   }
    ///////////////////////////////////////////////////  PROGRAMME 6 ////////////////////////////////////////////////////
    @Test
    public void guestUserShouldBeAbleToAddCommentsSuccessfully()
    {
  //      browserSelector.openBrowser();
        // Add comment as a guest customer
        guestComments.addComments();
        //Verify guest user should be able to add a comments successfully
        guestCommentsResults.verifyGuestUserSeeCommentsSuccessfulMessage();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 7 /////////////////////////////////////////////////
    @Test
    public void userShouldBeAbleToChangeCurrencySuccessfully()
    {
        browserSelector.openBrowser();
        // change currency US dollar to Euro
        changeCurrency.selectCurrencyUsDollarToEuro();
        // User should be able to change currency US dollar to Euro
        changeCurrencyResultPage.verifycurrencyChangeUsDollarToEuro();
        // change currency Euro to US dollar
        changeCurrency.selectCurrencyEuroToUsDollar();
        //// User should be able to change currency Euro to US dollar
        changeCurrencyResultPage.verifycurrencyChangeEuroToUSDollar();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 8 /////////////////////////////////////////////////
    @Test
    public void userShouldBeAbleToVerifyAddToCartButtonIsPresentSuccessfully()
    {
        browserSelector.openBrowser();
        //Scroll down to Featured products to see Add to cart Button
        addtoCartFeatureProducts.scrollDown();
        //Verify user can see Add to cart Button
        addtoCartForFeaturedProductsResultPage.verifyAddtoCartButtonIsPresent();
        browserSelector.quitBrowser();
    }
    /////////////////////////////////////////////////////  PROGRAMME 9 /////////////////////////////////////////////////
    @Test
    public void registeredUserShouldBeAbleToReferProductToAFriend()
    {
          browserSelector.openBrowser();
        // Login And Select Product To Refer To A Friend
        registeredUserReferetoFreiend.logInAndSelectProductToRefer();
        // verify user should be able to refer product to A Friend successfully
        registeredUserReferToAFriendResultPage.RegisteredUserShouldbeAbleToReferToAFriend();
        browserSelector.quitBrowser();
    }
}
    /////////////////////////////////////////////////////// THE END ////////////////////////////////////////////////////