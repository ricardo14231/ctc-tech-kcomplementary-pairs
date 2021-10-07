package com.ricardofarias.ctc.utils;

import com.ricardofarias.ctc.model.KComplementary;

public class KComplementaryBuilder {

    public static KComplementary criaZeroKComplementary() {
        return new KComplementary.Builder()
                .k(5)
                .elementoArray(-4)
                .elementoArray(1)
                .elementoArray(3)
                .build();
    }

    public static KComplementary criaTresKComplementary() {
        return new KComplementary.Builder()
                .k(8)
                .elementoArray(4)
                .elementoArray(4)
                .build();
    }

    public static KComplementary criaCincoKComplementary() {
        return new KComplementary.Builder()
                .k(2)
                .elementoArray(-2)
                .elementoArray(4)
                .build();
    }

    public static KComplementary criaSeisKComplementary() {
        return new KComplementary.Builder()
                .k(2)
                .elementoArray(1)
                .elementoArray(1)
                .elementoArray(2)
                .elementoArray(3)
                .elementoArray(1)
                .build();
    }

    public static KComplementary criaKComplementaryComArrayVazio() {
        return new KComplementary.Builder()
                .k(2)
                .build();
    }

    public static KComplementary criaKComplementaryComKIgualZero() {
        return new KComplementary.Builder()
                .k(0)
                .elementoArray(-2)
                .elementoArray(4)
                .build();
    }
}
