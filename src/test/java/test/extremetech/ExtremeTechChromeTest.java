package test.extremetech;

import dto.TestAttributeDTO;
import constant.TestWebsite;
import constant.WebDriverAttribute;
import test.AbstractTest;

public abstract class ExtremeTechChromeTest extends AbstractTest {

    @Override
    protected TestAttributeDTO getTestAttribute() {
        return new TestAttributeDTO(
                WebDriverAttribute.CHROME_WEB_DRIVER,
                TestWebsite.EXTREME_TECH_CR
        );
    }

    @Override
    public void finalizeTest() {
        super.webDriver.close();
    }
}
