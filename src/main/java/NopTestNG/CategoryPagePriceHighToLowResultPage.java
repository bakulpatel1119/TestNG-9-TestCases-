package NopTestNG;

import org.openqa.selenium.By;

public class CategoryPagePriceHighToLowResultPage extends Utils

{
 private By _priceHigToLowResults = By.xpath("//strong[text()=\"Filter by price\"]");
 String expected = "Filter by price";


    public void verifyPriceSortedHightoLow()
{
    assertURL("books?orderby=11");
    assertTextMessage("Filter by price", expected,_priceHigToLowResults);
}
}

