package dto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum WebDriverProperties {
    CHROME_WEB_DRIVER("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe", new ChromeDriver());
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
