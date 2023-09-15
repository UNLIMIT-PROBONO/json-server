package com.example.jsonserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
    @GetMapping
    public ResponseEntity<String> all(){
        String body = "{\n" +
                "    \"name\": \"kuku\",\n" +
                "    \"adminArea\": \"seoul\",\n" +
                "    \"phoneNumber\": \"010-1234-5678\",\n" +
                "    \"createdAt\": \"2023/07/06 05:13:25\",\n" +
                "    \"updatedAt\": \"2023/07/14 00:51:46\",\n" +
                "    \"activated\": true\n" +
                "}";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
