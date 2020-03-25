package NopTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AddtoCartForFeaturedProductsResultPage extends Utils
{
    public void verifyAddtoCartButtonIsPresent()
    {  SoftAssert softAssert = new SoftAssert();
        List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class=\"product-item\"]"));
          for (WebElement item: listOfItems) {


           if (!item.getAttribute("innerHTML").contains("Add to cart"))
            //This message will print if condition match
            {  System.out.println("THIS PRODUCT HAS NOOO ADD TO CART BUTTON : " + item.getText()); }
           //  This message will prit if condition does not match
            else { System.out.println("This product has Add to Cart Button : "+item.getText()); }
        }

    }
}
