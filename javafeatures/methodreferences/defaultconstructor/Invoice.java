package com.josh.java.training.javafeatures.methodreferences.defaultconstructor;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
class Invoice {

    String no;
    BigDecimal unitPrice;
    Integer qty;

    public Invoice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


}