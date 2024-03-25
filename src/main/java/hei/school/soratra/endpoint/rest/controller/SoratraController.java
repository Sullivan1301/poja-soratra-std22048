package hei.school.soratra.endpoint.rest.controller;

import hei.school.soratra.endpoint.SoratraResponse;
import hei.school.soratra.service.SoratraService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/poetique")
@AllArgsConstructor
public class SoratraController {
    private final SoratraService soratraService;

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> uploadPhrase(@PathVariable String id, @RequestBody String phrase) {
        soratraService.uploadPhrase(id, phrase);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SoratraResponse> getPhrase(@PathVariable String id) {
        SoratraResponse response = soratraService.getPhrase(id);
        return ResponseEntity.ok(response);
    } 
}
