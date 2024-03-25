package test;

import dto.TestAttributeDTO;
import constant.WebDriverAttribute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    private final WebDriverAttribute webDriverAttribute;
    private final String testingUrl;

    protected final WebDriver webDriver;

    public AbstractTest() {
        this.webDriverAttribute = getTestAttribute().webDriverAttribute();
        this.testingUrl = getTestAttribute().testWebsite().getUrl();
        this.webDriver = this.webDriverAttribute.getWebDriver();
    }

    protected abstract TestAttributeDTO getTestAttribute();

    @Before
    public void initializeTest() {
        System.setProperty(webDriverAttribute.getWebDriverProperty(), webDriverAttribute.getWebDriverPath());
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
