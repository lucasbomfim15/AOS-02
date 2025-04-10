package com.atv1.publicacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${backend.url}")
    private String backendUrl;

    @GetMapping
    public Map<String, String> getConfig() {
        return Map.of("backendUrl", backendUrl);
    }
}
