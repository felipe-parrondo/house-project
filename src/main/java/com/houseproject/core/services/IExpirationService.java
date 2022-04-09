package com.houseproject.core.services;

import com.houseproject.core.entities.ExpirationEntity;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public interface IExpirationService {
    List<ExpirationEntity> findAll();
    ExpirationEntity getExpirationProductById(BigInteger id);
    List<ExpirationEntity> getExpirationProductByExpirationDate(LocalDate date);
    ExpirationEntity createExpirationProduct(ExpirationEntity product);
    void deleteExpirationProduct(BigInteger id);
}
