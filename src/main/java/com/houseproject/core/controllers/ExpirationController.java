package com.houseproject.core.controllers;

import com.houseproject.core.services.IExpirationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expiration")
public class ExpirationController {

    private final IExpirationService service;

    @Autowired
    public ExpirationController(IExpirationService service) {
        this.service = service;
    }
}
