package com.houseproject.core.model;

import java.time.LocalDate;

public interface ExpirationProduct extends Product {
    LocalDate getEntryDate();
    LocalDate getExpirationDate();
}
