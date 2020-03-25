package NopTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeTest
    public void setUp()
    {
        browserSelector.openBrowser();
    }

    @AfterTest
    public void tearDown()
    {
        browserSelector.quitBrowser();
    }
}