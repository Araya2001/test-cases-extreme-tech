package test.extremetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CurrencyTest extends ExtremeTechChromeTest {

    @Override
    public void doTest() {
        clickOverColonesCurrency(super.webDriver);
        super.waitForSectionToFinalize(5);
    }

    private void clickOverColonesCurrency(WebDriver webDriver) {
        // First Click, to check available currencies
        WebElement currencySpan = webDriver.findElement(By.cssSelector("#leo_block_top > span"));
        currencySpan.click();
        // Second Click, to select Colónes as currency
        WebElement colonCurrencyElement = webDriver.findElement(By.cssSelector("#first-currencies > li > a"));
        colonCurrencyElement.click();
    }
}