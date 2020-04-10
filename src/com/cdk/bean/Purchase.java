package com.cdk.bean;

public class Purchase {

    private Double fromAmount;
    private Double toAmount;
    private Double discount;

    public Purchase() {
    }

    public Purchase(Double fromAmount, Double toAmount, Double discount) {
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.discount = discount;
    }

    public Double getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Double fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Double getToAmount() {
        return toAmount;
    }

    public void setToAmount(Double toAmount) {
        this.toAmount = toAmount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
