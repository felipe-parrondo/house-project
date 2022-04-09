package com.houseproject.core.entities;

import com.houseproject.core.model.ExpirationProduct;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name = "expiration")
public class ExpirationEntity implements ExpirationProduct {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(columnDefinition = "BIGINT", name = "expiration_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "expiration_name", nullable = false, length = 200)
    private String name;

    @Column(name = "expiration_entry-date", nullable = false, length = 200)
    private LocalDate entryDate;

    @Column(name = "expiration_expiration-date", nullable = false, length = 200)
    private LocalDate expirationDate;

    @Column(name = "expiration_amount", nullable = false, length = 200)
    private Integer amount;

    @Column(name = "expiration_codebar", nullable = false, length = 200)
    private String codebar;

    public ExpirationEntity() {

    }

    public ExpirationEntity(BigInteger id, String name, LocalDate entryDate, LocalDate expirationDate, Integer amount, String codebar) {
        this.id = id;
        this.name = name;
        this.entryDate = entryDate;
        this.expirationDate = expirationDate;
        this.amount = amount;
        this.codebar = codebar;
    }

    @Override
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String getCodebar() {
        return codebar;
    }

    public void setCodebar(String codebar) {
        this.codebar = codebar;
    }
}
