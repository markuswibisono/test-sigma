
package com.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/list/all")


public class HomeController {

    @GetMapping
    public String home() {

        return "testing";
    }

}