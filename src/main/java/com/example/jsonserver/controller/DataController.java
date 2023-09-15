package com.example.jsonserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {
    @GetMapping("/usage/{id}")
    public ResponseEntity<String> usage(@PathVariable("id") Long id){
        String body = "{\n" +
                "    \"userId\": 1,\n" +
                "    \"date\": \"2023-07-19\",\n" +
                "    \"call\": 1,\n" +
                "    \"electricity\": 3000,\n" +
                "    \"water\": 300,\n" +
                "    \"callAvg\": 2.29,\n" +
                "    \"electricityAvg\": 2435.71,\n" +
                "    \"waterAvg\": 164.29\n" +
                "}";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/avg/{id}")
    public ResponseEntity<String> avg(@PathVariable("id") Long id){
        String body = "{\n" +
                "    \"userId\": 1,\n" +
                "    \"callAverage\": 2.29,\n" +
                "    \"waterAverage\": 164.29,\n" +
                "    \"electricityAverage\": 2435.71,\n" +
                "    \"startDate\": \"2023/07/12 01:45\",\n" +
                "    \"endDate\": \"2023/07/19 01:45\"\n" +
                "}";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> userData(@PathVariable("id") Long id){
        String body = "[\n" +
                "    {\n" +
                "        \"userId\": 1,\n" +
                "        \"date\": \"2023/07/17\",\n" +
                "        \"call\": 2,\n" +
                "        \"electricity\": 1150,\n" +
                "        \"water\": 100\n" +
                "    },\n" +
                "    {\n" +
                "        \"userId\": 1,\n" +
                "        \"date\": \"2023/07/16\",\n" +
                "        \"call\": 3,\n" +
                "        \"electricity\": 1000,\n" +
                "        \"water\": 200\n" +
                "    },\n" +
                "    {\n" +
                "        \"userId\": 1,\n" +
                "        \"date\": \"2023/07/15\",\n" +
                "        \"call\": 4,\n" +
                "        \"electricity\": 2400,\n" +
                "        \"water\": 150\n" +
                "    }\n" +
                "]";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

}
