package test.extremetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class GaleriaDeFotosTest extends ExtremeTechChromeTest {
    @Override
    public void doTest() {
        clickNextButtonOnGallery(super.webDriver);

    }

    private void clickNextButtonOnGallery(WebDriver webDriver) {
        // Navegar a la página web
        super.waitForSectionToFinalize(15);

        // Verificar que se carguen correctamente las miniaturas de las imágenes
        WebElement miniaturas = webDriver.findElement(By.cssSelector("#slideshow-form_5213243696933496 > div > div > div.iviewSlider"));
        assertTrue(miniaturas.isDisplayed());


        // Comprobar la funcionalidad de los botones de siguiente y anterior
        WebElement siguiente = webDriver.findElement(By.cssSelector("#slideshow-form_5213243696933496 > div > div > div.iview-directionNav > a.iview-nextNav"));
        assertTrue(siguiente.isDisplayed());
        siguiente.click();
    }
}

