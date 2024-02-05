
package com.jocata.controller;

import com.entity.Tourist;
import com.exception.AgeLimitException;
import com.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {

    @Autowired
    private TouristService touristService;

    @GetMapping(value = "/")
    private String test() {
        return "<h1>Hello World!!</h1>";
    }

    @PostMapping(value = "/registration")
    private ResponseEntity<Tourist> registerTourist(@RequestBody Tourist tourist) throws AgeLimitException {
        tourist = touristService.saveTouristDetails(tourist);
        return new ResponseEntity<>(tourist, HttpStatus.OK);
    }
}
