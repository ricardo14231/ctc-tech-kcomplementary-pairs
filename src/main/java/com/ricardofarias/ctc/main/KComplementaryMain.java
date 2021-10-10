package com.ricardofarias.ctc.main;

import com.ricardofarias.ctc.model.KComplementary;

public class KComplementaryMain {

    /*
           O algoritmo desenvolvido tem a complexidade de O(n^2), pois os dados são processados em pares,
           com as duas iterações do "for".
           fonte da explicação do O(n^2): https://dev.to/danielle8farias/complexidade-de-algoritmos-notacao-big-o-26al
     */

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
                .elementoArray(2)
                .elementoArray(0)
                .elementoArray(-1)
                .elementoArray(3)
                .elementoArray(1)
                .build();

        kComplementary.verificaKComplementary();
    }
}
