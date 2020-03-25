package NopTestNG;

import org.openqa.selenium.By;

public class GuestCheckOut extends Utils {

    // object created for Loadprod class
    LoadProp loadProp = new LoadProp();

    private By _category = By.linkText("Books");
    private By _clickOnProduct = By.linkText("First Prize Pies");
    private By _clickonAddtoCartButton = By.xpath("//input[@id=\"add-to-cart-button-38\"]");
    private By _selectShopCart = By.xpath("//a[text()=\"shopping cart\"]");
    private By _clickTermsAndCond = By.xpath("//input[@id=\"termsofservice\"]");
    private By _clickSubmit = By.xpath("//button[@id=\"checkout\"]");
    private By _guestCheckout = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
    private By _firstName = By.id("BillingNewAddress_FirstName");
    private By _lastName = By.id("BillingNewAddress_LastName");
    private By _email = By.id("BillingNewAddress_Email");
    private By _country = By.xpath("//select[@data-trigger=\"country-select\"]");
    private By _stateProvince = By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]");
    private By _cityName = By.id("BillingNewAddress_City");
    private By _address1 = By.id("BillingNewAddress_Address1");
    private By _zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _phonenumber = By.id("BillingNewAddress_PhoneNumber");
    private By _submit = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
    private By _continueButton = By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    private By _selectPaymentMethod = By.xpath("//input[@id=\"paymentmethod_1\"]");
    private By _continueButton1 = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _selectCardTye = By.xpath("//select[@id=\"CreditCardType\"]");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _cardCode = By.id("CardCode");
    private By _cardExpiryMonth = By.xpath("//select[@id=\"ExpireMonth\"]");
    private By _continueButton2 = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _confirmButton = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");
    private String firstName1 = loadProp.getProperty("FirstName");
    private String lastName1 = loadProp.getProperty("LastName");
    private String email1 = loadProp.getProperty("Email");
    private String cityName1 = loadProp.getProperty("City");
    private String address1 = loadProp.getProperty("Address1");
    private String zipPostalCode1 = loadProp.getProperty("ZipPostalcode");
    private String phonenumber1 = loadProp.getProperty("Phonenumber");
    private String cardHolderName1 = loadProp.getProperty("CardholderName");
    private String cardnumber = loadProp.getProperty("CardNumber");
    private String cardcode = loadProp.getProperty("CardCode");
    private String countryName = loadProp.getProperty("CountryName");
    private String stateName = loadProp.getProperty("State");
    private String cardExpiry1 = loadProp.getProperty("CardExpiryMonth");
    private String cardType1 = loadProp.getProperty("CardType");


    public void enterDetailsForCheckout() {

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        //Click on Book Category
     clickonElement(_category);

     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     //Click on Product First Prize Pies
     clickonElement(_clickOnProduct);

     //Click on Add to Cart Button
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_clickonAddtoCartButton);

     //click on Select Shopping Cart Button on Popup Bar
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_selectShopCart);


     // accept terms and conditions
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_clickTermsAndCond);

     // click on submit button
     clickonElement(_clickSubmit);
     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

     // click on button guest checkout
     clickonElement(_guestCheckout);
     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

     //enter first name
     enterText(_firstName,firstName1);
     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

     // enter last name
     enterText(_lastName,lastName1);
     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

     // enter email address
     enterText(_email,email1);
     try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

     //select country name
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     selectFromDropDownByValue(_country,countryName);

     //select state
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     selectFromDropDownByValue(_stateProvince,stateName);

     //enter city name
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     enterText(_cityName,cityName1);

     // enter address line 1
     enterText(_address1,address1);

     // enter post code
     enterText(_zipPostalCode,zipPostalCode1);

     // enter phone number
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     enterText(_phonenumber, phonenumber1);

     // click on submit button
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_submit);

     // click on continue button
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_continueButton);

     // Select payment method
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_selectPaymentMethod);
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     // click on continues button
     clickonElement(_continueButton1);

     // select card type
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     selectFromDropDownByValue(_selectCardTye,cardType1);

     //enter card holder name
     enterText(_cardHolderName,cardHolderName1);

     //enter card number
     enterText(_cardNumber,cardnumber);

     //select card expiry month
     selectFromDropDownByValue(_cardExpiryMonth,cardExpiry1);

     //enter card verification code
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        enterText(_cardCode,cardcode);

     // click on continue button
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        clickonElement(_continueButton2);

     //click on confirm button
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
     clickonElement(_confirmButton);
 }
}
