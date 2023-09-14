package com.example.jsonserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping
    public String all(){
        return "[\n" +
                "    {\n" +
                "        \"userId\": 4,\n" +
                "        \"adminId\": 7,\n" +
                "        \"name\": \"김뫄뫄\",\n" +
                "        \"phoneNumber\": \"010-0000-0000\",\n" +
                "        \"address\": \"서울시 어쩌구 저쩌구\",\n" +
                "        \"gender\": \"여성\",\n" +
                "        \"birth\": \"1955-05-20\",\n" +
                "        \"health\": \"당뇨, 고혈압\",\n" +
                "        \"check\": \"일주일에 한번 병원 진료\",\n" +
                "        \"createdAt\": \"23. 8. 20. 오전 2:24\",\n" +
                "        \"updatedAt\": \"23. 8. 20. 오전 2:24\",\n" +
                "        \"activated\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"userId\": 5,\n" +
                "        \"adminId\": 7,\n" +
                "        \"name\": \"김홍홍\",\n" +
                "        \"phoneNumber\": \"010-0000-0000\",\n" +
                "        \"address\": \"부천시 어쩌구 저쩌구\",\n" +
                "        \"gender\": \"여성\",\n" +
                "        \"birth\": \"1964/04/23\",\n" +
                "        \"health\": \"치매 초기\",\n" +
                "        \"check\": \"주 1회 방문\",\n" +
                "        \"createdAt\": \"23. 8. 21. 오전 2:28\",\n" +
                "        \"updatedAt\": \"23. 8. 21. 오전 2:28\",\n" +
                "        \"activated\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"userId\": 7,\n" +
                "        \"adminId\": 7,\n" +
                "        \"name\": \"김컴공\",\n" +
                "        \"phoneNumber\": \"010-9876-5432\",\n" +
                "        \"address\": \"서울시 뫄뫄구\",\n" +
                "        \"gender\": \"남성\",\n" +
                "        \"birth\": \"1947/04/23\",\n" +
                "        \"health\": null,\n" +
                "        \"check\": null,\n" +
                "        \"createdAt\": \"23. 8. 21. 오전 2:34\",\n" +
                "        \"updatedAt\": \"23. 8. 21. 오전 2:34\",\n" +
                "        \"activated\": true\n" +
                "    }\n" +
                "]";
    }

    @GetMapping("/{userId}")
    public String one(@PathVariable("userId") Long id) {
        return  "{\n" +
                "    \"userId\": 4,\n" +
                "    \"adminId\": 7,\n" +
                "    \"name\": \"김뫄뫄\",\n" +
                "    \"phoneNumber\": \"010-0000-0000\",\n" +
                "    \"address\": \"서울시 어쩌구 저쩌구\",\n" +
                "    \"gender\": \"여성\",\n" +
                "    \"birth\": \"1955-05-20\",\n" +
                "    \"health\": \"당뇨, 고혈압\",\n" +
                "    \"check\": \"일주일에 한번 병원+ 진료\",\n" +
                "    \"createdAt\": \"23. 8. 20. 오전 2:24\",\n" +
                "    \"updatedAt\": \"23. 8. 20. 오전 2:24\",\n" +
                "    \"activated\": true\n" +
                "}";
    }
}
