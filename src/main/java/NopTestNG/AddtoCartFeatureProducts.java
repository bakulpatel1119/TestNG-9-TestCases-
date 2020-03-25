package NopTestNG;

import org.openqa.selenium.JavascriptExecutor;

public class AddtoCartFeatureProducts extends Utils
{
public void scrollDown()
{
    // scroll down page to reach Featured products to check Add to Cart Button

    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("scroll(0, 1200);");
    try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

    // No more actions are required as we just have to check if Add to Cart Button is Present, which will do in Result Page
    // End //
}
}
