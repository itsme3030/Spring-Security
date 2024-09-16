package org.example.section1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;

@RestController()
public class restapicontroller {

    @GetMapping("/welcome")
    public String Hellow() {
        return "hellow there security";
    }
}
