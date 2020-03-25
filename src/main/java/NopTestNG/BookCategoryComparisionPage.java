package NopTestNG;

import org.openqa.selenium.By;

public class BookCategoryComparisionPage extends Utils

{
    private By _category = By.linkText("Books");
    private By _fahrenheit451 = By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/37\"),!1']");
    private By _firstprizepies = By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/38\"),!1']");
    private By _compare = By.linkText("product comparison");

    public void selectProductsToCompare ()
    {
       try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        //click on Book category
        clickonElement(_category);

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
        // Click on Add to Compare for product Fahrenheit 451 by Ray Bradbury
        clickonElement(_fahrenheit451);

        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
        //Click on Add to Compare for product First Prize Pies
        clickonElement(_firstprizepies);

        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        // Click on Product comparision on Popup Bar
        clickonElement(_compare);
    }
}









