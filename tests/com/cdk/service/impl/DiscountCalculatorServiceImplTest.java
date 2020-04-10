package com.cdk.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class DiscountCalculatorServiceImplTest {

    @InjectMocks
    DiscountCalculatorServiceImpl discountCalculatorService = new DiscountCalculatorServiceImpl();

    @Test
    public void testGetBillAmountForRegularCustomer() {
        final String customerType = "Regular";
        Double purchaseAmount = 15000.0;
        Double billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 13500.0);
        purchaseAmount = 5000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 5000.0);
        purchaseAmount = 10000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 9500.0);
    }

    @Test
    public void testGetBillAmountForPremiumCustomer() {
        final String customerType = "Premium";
        Double purchaseAmount = 15000.0;
        Double billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 12300.0);
        purchaseAmount = 5000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 4450.0);

        purchaseAmount = 10000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 8600.0);

        purchaseAmount = 4000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 3600.0);

        purchaseAmount = 8000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 7000.0);

        purchaseAmount = 20000.0;
        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertEquals(billAmt, 15800.0);


        billAmt = discountCalculatorService.getBillAmount(purchaseAmount, customerType);
        Assertions.assertNotEquals(billAmt, 9500.0);
    }
}
