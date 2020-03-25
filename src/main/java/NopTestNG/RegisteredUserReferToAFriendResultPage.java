package NopTestNG;

import org.openqa.selenium.By;

public class RegisteredUserReferToAFriendResultPage extends Utils
{

    private By _registeredUserShouldSuccess = By.xpath("//div[@class=\"result\"]");
    String expexted = "Your message has been sent.";

    public void RegisteredUserShouldbeAbleToReferToAFriend()
    {
        assertURL("productemailafriend/37");
       // assertTextMessage("Your message has been sent.", expexted,_registeredUserShouldSuccess);
    }





}
