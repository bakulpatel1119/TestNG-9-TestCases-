package NopTestNG;
import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");
String expected = "Your registration completed";

public void verifyUserSeeRegistrationSuccessMessage()
{assertTextMessage("Your registration completed",expected,_registerSuccessMessage); }
}
