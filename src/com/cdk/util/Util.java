package com.cdk.util;

import com.cdk.bean.Customer;
import com.cdk.bean.CustomerType;
import com.cdk.bean.Purchase;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static Customer getCustomerByType(CustomerType type) {
        Customer customer = new Customer();
        customer.setType(type);
        List<Purchase> purchases = new ArrayList<>();
        Purchase purchase;
        switch (type) {
            case REGULAR:
                purchase = new Purchase(0.0, 5000.0, 0.0);
                purchases.add(purchase);
                purchase = new Purchase(5000.0, 10000.0, 10.0);
                purchases.add(purchase);
                purchase = new Purchase(10000.0, Double.MAX_VALUE, 20.0);
                purchases.add(purchase);
                break;
            case PREMIUM:
                purchase = new Purchase(0.0, 4000.0, 10.0);
                purchases.add(purchase);
                purchase = new Purchase(4000.0, 8000.0, 15.0);
                purchases.add(purchase);
                purchase = new Purchase(8000.0, 12000.0, 20.0);
                purchases.add(purchase);
                purchase = new Purchase(12000.0, Double.MAX_VALUE, 30.0);
                purchases.add(purchase);
                break;
        }
        customer.setPurchases(purchases);

        return customer;
    }
}
