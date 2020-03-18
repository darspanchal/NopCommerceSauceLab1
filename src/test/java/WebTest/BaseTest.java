package WebTest;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before

    public void OpenBrowser()
    {
        browserSelector.setUpBrowser();
    }
    @After
    public void CloseBrowser()
    {
      browserSelector.CloseBrowser();
    }
}
