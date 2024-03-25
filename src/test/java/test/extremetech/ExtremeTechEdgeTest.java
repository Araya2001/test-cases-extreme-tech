package test.extremetech;

import dto.TestProperties;
import dto.TestWebsite;
import dto.WebDriverProperties;
import test.AbstractTest;

public abstract class ExtremeTechEdgeTest extends AbstractTest {

    @Override
    protected TestProperties getTestProperties() {
        return new TestProperties(
                WebDriverProperties.EDGE_DRIVER,
                TestWebsite.EXTREME_TECH_CR
        );
    }

    @Override
    public void finalizeTest() {
        super.webDriver.close();
    }
}
