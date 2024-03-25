package test.extremetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class MigasDePanTest extends ExtremeTechChromeTest {
    @Override
    public void doTest() {
        clickOverComponentes(super.webDriver);
        super.waitForSectionToFinalize(3);
        clickOverComponentesProcesadores(super.webDriver);
        super.waitForSectionToFinalize(3);
        assertThatMigasDePanIsTrue(super.webDriver);
        super.waitForSectionToFinalize(1);
    }

    private void clickOverComponentes(WebDriver webDriver) {
        WebElement componentesSubMenuElement = webDriver.findElement(By.cssSelector("#leo-top-menu > ul > li:nth-child(2) > a > span"));
        componentesSubMenuElement.click();
    }

    private void clickOverComponentesProcesadores(WebDriver webDriver) {
        WebElement procesadoresElement = webDriver.findElement(By.cssSelector("#subcategories > div > div:nth-child(1) > div > h5 > a"));
        procesadoresElement.click();
    }

    private void assertThatMigasDePanIsTrue(WebDriver webDriver) {
        WebElement procesadoresElement = webDriver.findElement(By.cssSelector("#breadcrumb > div > div > span.navigation_page"));
        assertEquals("Las migas de pan no contienen el enlace correcto", "COMPONENTES>PROCESADORES", procesadoresElement.getText());
    }
}
