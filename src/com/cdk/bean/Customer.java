package com.cdk.bean;

import java.util.List;

public class Customer {

    private CustomerType type;
    private List<Purchase> purchases;

    public Customer() {
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
}
