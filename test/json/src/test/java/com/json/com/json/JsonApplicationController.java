package com.json.com.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonApplicationController {
    @GetMapping("/home")
    public static String name(){
       return  "hello world";
    }
}
