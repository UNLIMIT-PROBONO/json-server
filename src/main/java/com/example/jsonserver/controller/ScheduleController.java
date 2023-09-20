package com.example.jsonserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @GetMapping
    public ResponseEntity<String> all() {
        String body = "[\n" +
                "    {\n" +
                "        \"scheduleId\": 1,\n" +
                "        \"managerId\": 1,\n" +
                "        \"userId\": 1,\n" +
                "        \"title\": \"이칠학 할머니 전화 드리기\",\n" +
                "        \"content\": \"9월 30일 방문 예약\",\n" +
                "        \"startDate\": \"2023-09-15T10:00:00\",\n" +
                "        \"endDate\": \"2023-09-16T11:00:00\",\n" +
                "        \"createdAt\": \"2023-09-01T12:34:56\",\n" +
                "        \"updatedAt\": \"2023-09-01T12:34:56\",\n" +
                "        \"activated\": true\n" +
                "    },\n" +
                "{\n" +
                "        \"scheduleId\": 3,\n" +
                "        \"managerId\": 1,\n" +
                "        \"userId\": 1,\n" +
                "        \"title\": \"신한 은행 적금 만기\",\n" +
                "        \"content\": \"\",\n" +
                "        \"startDate\": \"2023-09-17T10:00:00\",\n" +
                "        \"endDate\": \"2023-09-19T11:00:00\",\n" +
                "        \"createdAt\": \"2023-09-01T12:34:56\",\n" +
                "        \"updatedAt\": \"2023-09-01T12:34:56\",\n" +
                "        \"activated\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"scheduleId\": 2,\n" +
                "        \"managerId\": 1,\n" +
                "        \"userId\": 2,\n" +
                "        \"title\": \"황대혁 할아버지 방문\",\n" +
                "        \"content\": \"약 잘 챙겨 드시는지 확인하기\",\n" +
                "        \"startDate\": \"2023-09-20T14:00:00\",\n" +
                "        \"endDate\": \"2023-09-20T15:00:00\",\n" +
                "        \"createdAt\": \"2023-09-01T13:45:00\",\n" +
                "        \"updatedAt\": \"2023-09-01T13:45:00\",\n" +
                "        \"activated\": true\n" +
                "    }\n" +
                "]";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> one(@PathVariable("id") Long id) {
        String body = "{\n" +
                "    \"scheduleId\": 1,\n" +
                "    \"managerId\": 1,\n" +
                "    \"userId\": 1,\n" +
                "    \"title\": \"\",\n" +
                "    \"content\": \"\",\n" +
                "    \"startDate\": \"2023-09-01T10:00:00\",\n" +
                "    \"endDate\": \"2023-09-01T11:00:00\",\n" +
                "    \"createdAt\": \"2023-09-01T12:34:56\",\n" +
                "    \"updatedAt\": \"2023-09-01T12:34:56\",\n" +
                "    \"activated\": true\n" +
                "}";
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @PostMapping
    public ResponseEntity<Void> save() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
