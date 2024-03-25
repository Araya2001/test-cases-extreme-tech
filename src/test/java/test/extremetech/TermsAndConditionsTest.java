package test.extremetech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsAndConditionsTest extends ExtremeTechChromeTest {

    public TermsAndConditionsTest() {
        super();
    }

    @Override
    public void doTest() {
        this.scrollToBottom(super.webDriver);
        super.waitForSectionToFinalize(2);
        this.clickOverTermsAndConditionsFooterSection(super.webDriver);
        super.waitForSectionToFinalize(5);
    }

    private void scrollToBottom(WebDriver webDriver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    private void clickOverTermsAndConditionsFooterSection(WebDriver webDriver) {
        WebElement termsAndConditionsElement = webDriver.findElement(By.cssSelector(
                "#footer > div > div.wrapper > div > div > div:nth-child(1) > div > div > section > ul > li:nth-child(2) > span > a"
        ));
        termsAndConditionsElement.click();
    }


}
