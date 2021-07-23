package com.cc1024201.gof23.factory.simple.code;

import java.util.Objects;

import org.junit.jupiter.api.Test;

/**
 * @author zhcao
 */
public class FacotryTest {
    @Test
    public void testA() {
        Objects.requireNonNull(SimpleFacotry.userProduct("A")).use();
    }

    @Test
    public void testB() {
        Objects.requireNonNull(SimpleFacotry.userProduct("B")).use();
    }
}
