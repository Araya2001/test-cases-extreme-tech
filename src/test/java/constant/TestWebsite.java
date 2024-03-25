package constant;

public enum TestWebsite {
    EXTREME_TECH_CR("https://extremetechcr.com/tienda/")
    ;
    private final String url;

    TestWebsite(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
