package dto;

import constant.TestWebsite;
import constant.WebDriverAttribute;

public record TestAttributeDTO(
        WebDriverAttribute webDriverAttribute,
        TestWebsite testWebsite
) {
}
