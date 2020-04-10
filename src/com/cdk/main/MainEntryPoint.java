package com.cdk.main;

import com.cdk.service.DiscountCalculatorService;
import com.cdk.service.impl.DiscountCalculatorServiceImpl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainEntryPoint {

    public static void main(final String[] args) {

        DiscountCalculatorService calculatorService = new DiscountCalculatorServiceImpl();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);

        List<Double> inputs = new ArrayList<>();
        inputs.add(5000.0);
        inputs.add(10000.0);
        inputs.add(15000.0);
        String customerType = "Regular";

        System.out.println("**************Customer Type: "+ customerType + "******************\n");
        for (Double d: inputs) {
            System.out.println("Purchase Amount : " + numberFormat.format(d));
            Double billAmount = calculatorService.getBillAmount(d, customerType);
            System.out.println("Bill Amount : " + numberFormat.format(billAmount) + "\n");
        }
        System.out.println("-------------------------------------------------------------------------\n");
        inputs.clear();
        inputs.add(4000.0);
        inputs.add(8000.0);
        inputs.add(12000.0);
        inputs.add(20000.0);
        customerType = "Premium";

        System.out.println("**************Customer Type: "+ customerType + "******************\n");
        for (Double d: inputs) {
            System.out.println("Purchase Amount : " + numberFormat.format(d));
            Double billAmount = calculatorService.getBillAmount(d, customerType);
            System.out.println("Bill Amount : " + numberFormat.format(billAmount) + "\n");
        }

    }
}
