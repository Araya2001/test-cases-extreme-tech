package test.extremetech;

import dto.TestProperties;
import dto.TestWebsite;
import dto.WebDriverProperties;
import test.AbstractTest;

public abstract class ExtremeTechChromeTest extends AbstractTest {

    @Override
    protected TestProperties getTestProperties() {
        return new TestProperties(
                WebDriverProperties.CHROME_WEB_DRIVER,
                TestWebsite.EXTREME_TECH_CR
        );
    }

    @Override
    public void finalizeTest() {
        super.webDriver.close();
    }
}
