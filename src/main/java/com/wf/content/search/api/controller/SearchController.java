package com.wf.content.search.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search/healthcheck")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok().build();
    }
}
