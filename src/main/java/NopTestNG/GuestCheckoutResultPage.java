package NopTestNG;

import org.openqa.selenium.By;

public class GuestCheckoutResultPage extends Utils

{
    private By _guestCheckOutResult =  By.xpath("//strong[text()=\"Your order has been successfully processed!\"]");
    String expected = "Your order has been successfully processed!";


    // verify Guest user can checkout successfully
    public void verifyCheckoutSuccessfulMessage()
    {
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        // assert text message of the URL
        assertURL("checkout/completed");

        // assert message displayed when Guest user successfully processed Check Out
        assertTextMessage("Your order has been successfully processed!",expected,_guestCheckOutResult);
    }
}
