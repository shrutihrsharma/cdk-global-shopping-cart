package com.cdk.service;

public interface DiscountCalculatorService {

    Double getBillAmount(final Double purchaseAmount, final String customerType);
}
