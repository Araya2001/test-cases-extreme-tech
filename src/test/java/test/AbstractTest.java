package test;

import dto.TestProperties;
import dto.WebDriverProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    private final WebDriverProperties webDriverProperties;
    private final String testingUrl;

    protected final WebDriver webDriver;

    public AbstractTest() {
        this.webDriverProperties = getTestProperties().webDriverProperties();
        this.testingUrl = getTestProperties().testWebsite().getUrl();
        this.webDriver = this.webDriverProperties.getWebDriver();
    }

    protected abstract TestProperties getTestProperties();

    @Before
    public void initializeTest() {
        System.setProperty(webDriverProperties.getWebDriverProperty(), webDriverProperties.getWebDriverPath());
        webDriver.get(testingUrl);
    }

    @Test
    public abstract void doTest();

    @After
    public abstract void finalizeTest();

    protected void waitForSectionToFinalize(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}
