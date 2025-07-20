package com.example.fitsandgiggles.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ApiController {

    @GetMapping("/items")
    public ResponseEntity<List<String>> getItems() {

        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping("/items")
    public ResponseEntity<String> postItem(@RequestBody String item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }




}
