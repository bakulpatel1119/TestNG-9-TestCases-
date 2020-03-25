package NopTestNG;
import org.openqa.selenium.By;

public class RegisteredUserReferetoFreiend extends Utils

{
    private By _login = By.linkText("Log in");
    private By _emailAddress = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _submitLogin = By.xpath("//input[@class=\"button-1 login-button\"]");
    private By _category = By.linkText("Books");
    private By _fahrenheit451 = By.xpath("//h2/a[text()=\"Fahrenheit 451 by Ray Bradbury\"]");
    private By _emailToFriend = By.xpath("//input[@onclick='setLocation(\"/productemailafriend/37\")']");
    private By _friendEmailAddress = By.xpath("//input[@class=\"friend-email\"]");
    private By _yourEmailAddress = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _clickSendEmailButton = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

    public void logInAndSelectProductToRefer(){

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        // Click on login button
        clickonElement(_login);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Enter Valid email address
        enterText(_emailAddress,"super@super.com");

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Enter valid Password
        enterText(_password, "supersuper");

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
        //click on login button
        clickonElement(_submitLogin);

        try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace(); }
        // click on Book Category
        clickonElement(_category);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        ////Click on Click on product Fahrenheit 451 by Ray Bradbury
        clickonElement(_fahrenheit451);

        try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace(); }
        // // And Click on Email a Friend
        clickonElement(_emailToFriend);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Enter Friend's email address
        enterText(_friendEmailAddress, "bakulpatel1119@gmail.com");

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Click on Send Email button
        clickonElement(_clickSendEmailButton);
    }
}

