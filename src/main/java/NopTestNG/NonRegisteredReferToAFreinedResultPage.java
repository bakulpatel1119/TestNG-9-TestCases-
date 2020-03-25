package NopTestNG;

import org.openqa.selenium.By;

public class NonRegisteredReferToAFreinedResultPage extends Utils
{

    private By _nonRegisteredUserNotSuccess = By.xpath("//li[text()=\"Only registered customers can use email a friend feature\"]");
    String expected = "Only registered customers can use email a friend feature";



    public void nonRegisteredUserShouldNotbeAbleToReferToAFriend()
    {
        assertTextMessage("Only registered customers can use email a friend feature", expected, _nonRegisteredUserNotSuccess);
    }

}
