package com.udemy.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // you can also use @NonNull instead of final
    private final String orderTrackingNumber;
}
