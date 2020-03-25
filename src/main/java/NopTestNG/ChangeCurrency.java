package NopTestNG;

import org.openqa.selenium.By;

public class ChangeCurrency extends Utils
{
    private By _changeCurrency = By.xpath("//select[@id=\"customerCurrency\"]");

    //Select and Change Currency from US Dollar To Euro
    public void selectCurrencyUsDollarToEuro()
    { selectFromDropDownByVisible(_changeCurrency,"Euro"); }

    //Select and Change Currancy from Euro To US Dollar
    public void selectCurrencyEuroToUsDollar()
    { selectFromDropDownByVisible(_changeCurrency,"US Dollar"); }

}