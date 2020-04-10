package com.cdk.service.impl;

import com.cdk.bean.Customer;
import com.cdk.bean.CustomerType;
import com.cdk.bean.Purchase;
import com.cdk.service.DiscountCalculatorService;
import com.cdk.util.Util;

public class DiscountCalculatorServiceImpl implements DiscountCalculatorService {

    @Override
    public Double getBillAmount(final Double purchaseAmount, String customerType) {
        Customer customer = Util.getCustomerByType(CustomerType.getBYCustomerType(customerType));
        Double discountAmount = 0.0;
        for (int i=0; i< customer.getPurchases().size(); i++) {
            Purchase p = customer.getPurchases().get(i);
            if(p.getDiscount() > 0.0) {
                final Double intermediateDiscount = getDiscount(p.getToAmount(), p.getFromAmount(), p.getDiscount(), purchaseAmount);
                discountAmount = discountAmount + intermediateDiscount;
                if (intermediateDiscount == 0.0) {
                    break;
                }
            }
        }
        return purchaseAmount - discountAmount;
    }

    public Double getDiscount(Double to, Double from, Double percent, Double amount) {
        Double sub;
        sub = amount > to ? to : amount;
        Double discount = (sub - from) * percent / 100;
        return discount < 0.0 ? 0.0 : discount;
    }
}
