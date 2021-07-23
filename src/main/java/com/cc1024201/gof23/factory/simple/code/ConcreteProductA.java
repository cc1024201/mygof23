package com.cc1024201.gof23.factory.simple.code;


import lombok.extern.slf4j.Slf4j;

/**
 * @author zhcao
 */
@Slf4j
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        log.info("productA");
    }
}
