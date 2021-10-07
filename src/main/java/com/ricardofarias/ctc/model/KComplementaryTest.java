package com.ricardofarias.ctc.model;

public class KComplementaryTest {

    public static void main(String[] args) {
/*
        KComplementary kComplementary = new KComplementary.Builder()
                .k(6)
                .elementoArray(1)
                .elementoArray(8)
                .elementoArray(-3)
                .elementoArray(0)
                .elementoArray(1)
                .elementoArray(3)
                .elementoArray(-2)
                .elementoArray(4)
                .elementoArray(5)
                .build();

        kComplementary.verificaKComplementary();

 */
        KComplementary kComplementary = new KComplementary.Builder()
                .k(2)
                .elementoArray(1)
                .elementoArray(1)
                .elementoArray(2)
                .elementoArray(3)
                .elementoArray(1)
                .build();

        kComplementary.verificaKComplementary();
    }
}
