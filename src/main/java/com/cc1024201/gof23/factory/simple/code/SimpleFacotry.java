package com.cc1024201.gof23.factory.simple.code;

/**
 * @author zhcao
 */
public class SimpleFacotry {
    private static final String PRODUCTA = "A";
    private static final String PRODUCTB = "B";

    public static Product userProduct(String productType) {
        if (PRODUCTA.equals(productType)) {
            return new ConcreteProductA();
        } else if (PRODUCTB.equals(productType)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
