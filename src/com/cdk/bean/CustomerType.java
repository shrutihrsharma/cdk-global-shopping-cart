package com.cdk.bean;

public enum CustomerType {

    REGULAR("Regular"), PREMIUM("Premium");

    public String value;

    CustomerType(String regular) {
    }

    public static CustomerType getBYCustomerType(String value) {
        switch (value) {
            case "Regular": return CustomerType.REGULAR;
            case "Premium": return CustomerType.PREMIUM;
            default: throw new IllegalArgumentException(value);
        }
    }
}
