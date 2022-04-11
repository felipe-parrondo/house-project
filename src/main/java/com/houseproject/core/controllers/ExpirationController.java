package com.houseproject.core.controllers;

import com.houseproject.core.entities.ExpirationEntity;
import com.houseproject.core.services.IExpirationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/expiration")
public class ExpirationController {

    private final IExpirationService service;

    @Autowired
    public ExpirationController(IExpirationService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ExpirationEntity>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpirationEntity> getExpirationProductById(@PathVariable(value = "id") BigInteger id) {
        return new ResponseEntity<>(service.getExpirationProductById(id), HttpStatus.OK);
    }

    @GetMapping("/{date}")
    public ResponseEntity<List<ExpirationEntity>> getExpirationProductByExpirationDate(@PathVariable(value = "date")LocalDate date) {
        return new ResponseEntity<>(service.getExpirationProductByExpirationDate(date), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExpirationEntity> createExpirationProduct(ExpirationEntity product) {
        return new ResponseEntity<>(service.createExpirationProduct(product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteExpirationProduct(@PathVariable(value = "id") BigInteger id) {
        service.deleteExpirationProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
