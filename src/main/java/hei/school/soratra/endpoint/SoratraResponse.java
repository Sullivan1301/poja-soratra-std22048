package hei.school.soratra.endpoint;

public class SoratraResponse {
    private final String originalUrl;
    private final String transformedUrl;

    public SoratraResponse(String originalUrl, String transformedUrl) {
        this.originalUrl = originalUrl;
        this.transformedUrl = transformedUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getTransformedUrl() {
        return transformedUrl;
    }
}
