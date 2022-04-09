package com.houseproject.core.respositories;

import com.houseproject.core.entities.ExpirationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpirationRespository extends CrudRepository<ExpirationEntity, BigInteger> {
    List<ExpirationEntity> findAll();
    List<ExpirationEntity> findAllByExpirationDate(LocalDate date);
}
