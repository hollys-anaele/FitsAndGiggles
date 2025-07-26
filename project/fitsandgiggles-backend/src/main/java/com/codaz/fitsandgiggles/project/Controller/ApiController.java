package com.codaz.fitsandgiggles.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ApiController {

    @GetMapping("/items")
    public ResponseEntity<String> getItems() {
    return ResponseEntity.ok("{\"message\":\"TESTING\"}");    }

    @PostMapping("/items")
    public ResponseEntity<String> postItem(@RequestBody String item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }
}
