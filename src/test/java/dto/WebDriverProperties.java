package dto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public enum WebDriverProperties {
    CHROME_WEB_DRIVER("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe", new ChromeDriver()),
    EDGE_DRIVER("webdriver.edge.driver", "./src/test/resources/edgedriver/edgedriver.exe", new EdgeDriver());
    private final String webDriverProperty;
    private final String webDriverPath;

    private final WebDriver webDriver;

    WebDriverProperties(String webDriverProperty, String webDriverPath, WebDriver webDriver) {
        this.webDriverProperty = webDriverProperty;
        this.webDriverPath = webDriverPath;
        this.webDriver = webDriver;
    }

    public String getWebDriverProperty() {
        return webDriverProperty;
    }

    public String getWebDriverPath() {
        return webDriverPath;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
