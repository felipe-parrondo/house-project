package com.houseproject.core.services;

import com.houseproject.core.entities.ExpirationEntity;
import com.houseproject.core.respositories.ExpirationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ExpirationService implements IExpirationService{

    public final ExpirationRespository respository;

    @Autowired
    public ExpirationService(ExpirationRespository respository) {
        this.respository = respository;
    }

    public List<ExpirationEntity> findAll() {
        return respository.findAll();
    }

    public ExpirationEntity getExpirationProductById(BigInteger id) {
        return respository.findById(id).orElse(new ExpirationEntity());
    }

    public List<ExpirationEntity> getExpirationProductByExpirationDate(LocalDate date) {
        return respository.findAllByExpirationDate(date);
    }

    public ExpirationEntity createExpirationProduct(ExpirationEntity product) {
        return respository.save(product);
    }

    public void deleteExpirationProduct(BigInteger id) {
        try {
            respository.deleteById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getLocalizedMessage());
        }
    }
}
