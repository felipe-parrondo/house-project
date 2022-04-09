package com.houseproject.core.model;

import java.math.BigInteger;

public interface Product {
    BigInteger getId();
    String getName();
    Integer getAmount();
    String getCodebar();
}
