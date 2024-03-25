package hei.school.soratra.service;

import hei.school.soratra.endpoint.SoratraResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SoratraService {

    //private final StorageComponent storageComponent;

    public void uploadPhrase(String id, String phrase) {
        String originalUrl = storeOriginalPhrase(id, phrase);
        String transformedUrl = storeTransformedPhrase(id, phrase);
    }

    public SoratraResponse getPhrase(String id) {
        String originalUrl = "https://original.url";
        String transformedUrl = "https://transformed.url";
        return new SoratraResponse(originalUrl, transformedUrl);
    }

    private String storeOriginalPhrase(String id, String phrase) {
        return "https://original.url"; 
    }

    private String storeTransformedPhrase(String id, String phrase) {
        return "https://transformed.url";
    }
}
