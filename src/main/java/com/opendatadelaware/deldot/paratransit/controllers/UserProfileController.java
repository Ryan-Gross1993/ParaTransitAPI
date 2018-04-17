package com.opendatadelaware.deldot.paratransit.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserProfileController {

    @PostMapping(value = "/api/registration")
    public ResponseEntity<String> registerApplicant(@RequestBody String name) {
        return ResponseEntity.ok("Registered!");
    }

    @PostMapping(value ="/api/login")
    public ResponseEntity<String> login(@RequestParam String userName, @RequestParam String password) {
        return ResponseEntity.ok("Logged in");
    }

    @GetMapping(value = "/api")
    public String helloWorld() {
        return "derp";
    }

    @PostMapping(value = "/api/name")
    public String sayHello(@RequestBody String userName) {
        return "Hello, " + userName;
    }

}
