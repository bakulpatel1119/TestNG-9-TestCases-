package NopTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ChangeCurrencyResultPage extends Utils
{
//-----------VERIFY CURRANCY CHANGE US DOLLAR TO EURO ---------------------
        public void verifycurrencyChangeUsDollarToEuro()
        {
            // Soft Assert used to verify the result
            SoftAssert softAssert = new SoftAssert();
            List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
            for (WebElement we: productPrice)
            {
                softAssert.assertTrue(we.getText().contains("Ђ"),"Ђ is not found in"+we.getText());
            }
            softAssert.assertAll();
            System.out.println("Please check your currency");
        }
//---------VERIFY CURRENCY CHANGE FROM EURO TO US DOLLAR ---------------------
    public void verifycurrencyChangeEuroToUSDollar()
    {
        // Soft Assert used to verify the result
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we: productPrice)
        {
            softAssert.assertTrue(we.getText().contains("$"),"$ is not found in"+we.getText());
        }
        softAssert.assertAll();
        System.out.println("Please check your Currency");
    }
}


