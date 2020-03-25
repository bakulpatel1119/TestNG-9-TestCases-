package NopTestNG;

import org.openqa.selenium.By;

public class CategoryPagePriceHighToLow extends Utils {

    private By _category = By.linkText("Books");
    private By _clickSortBy = By.xpath("//select[@id=\"products-orderby\"]");
    //private By _selectPriceHightoLow = By.xpath()

    public void sortPriceHighToLow()
    {
        try {  Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Click on Book Category
        clickonElement(_category);
        waitforElementisPresent(_clickSortBy,10);

        //Select filter Sort by and Select price High to Low
        selectFromDropDownByValue(_clickSortBy,"https://demo.nopcommerce.com/books?orderby=11");
        waitUntilClickable(_clickSortBy,10);
    }
}