package NopTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils{
    public By _registerlink = By.xpath("//a[text()=\"Register\"]");



    public void clickOnRegisterButton()
    {         try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        clickonElement(_registerlink); }


    public void clicOnCategoryLinks (String category)
    { try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.findElement(By.linkText(category)).click(); }



    public void selectCategory(String category)
    {
       Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("category"))).build().perform();
    }


    public void clickOnSubCategory(String subcategory)
    {
        driver.findElement(By.linkText("subcategory")).click();
    }

    public void userShouldBeAbleToSeeProductSuccessfully()
    {


    }


}
