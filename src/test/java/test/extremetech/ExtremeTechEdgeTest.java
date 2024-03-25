package test.extremetech;

import dto.TestAttributeDTO;
import constant.TestWebsite;
import constant.WebDriverAttribute;
import test.AbstractTest;

public abstract class ExtremeTechEdgeTest extends AbstractTest {

    @Override
    protected TestAttributeDTO getTestAttribute() {
        return new TestAttributeDTO(
                WebDriverAttribute.EDGE_DRIVER,
                TestWebsite.EXTREME_TECH_CR
        );
    }

    @Override
    public void finalizeTest() {
        super.webDriver.close();
    }
}
