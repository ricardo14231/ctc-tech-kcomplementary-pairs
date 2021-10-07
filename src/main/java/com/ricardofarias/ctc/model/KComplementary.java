package com.ricardofarias.ctc.model;

import java.util.ArrayList;
import java.util.List;

public class KComplementary {

    private static int K;
    private static List<Integer> A;

    private KComplementary(int k, List<Integer> A) {
        this.K = k;
        this.A = A;
    }

    public static class Builder {
        private int K = 0;
        private List<Integer> A = new ArrayList<>();

        public Builder k(int k) {
            this.K = k;
            return this;
        }

        public Builder elementoArray(Integer elemento) {
            this.A.add(elemento);
            return this;
        }

        public KComplementary build() {
            return new KComplementary(this.K, this.A);
        }
    }

    public static int verificaKComplementary() {
        List<Integer> posicaoI = new ArrayList<>();
        List<Integer> posicaoJ = new ArrayList<>();

        int contK = 0;

        for (int i=0; i < A.size(); i++) {
            for (int j=i; j < A.size(); j++) {
                if(A.get(i) + A.get(j) == K) {
                    posicaoI.add(i);
                    posicaoJ.add(j);
                    contK++;
                }
            }
        }
        resultado(contK, posicaoI, posicaoJ);

        //O método retorna a quantidade de KComplementares para ser realizado os testes de unidade.
        return contK;
    }

    public static void resultado(int contK, List<Integer> posicaoI, List<Integer> posicaoJ) {

        System.out.println("--------------------------");
        System.out.println(String.format("O Array possui '%d' KComplementary.", contK));

        if(contK > 0) {
            System.out.println("Nas posições: ");
            for (int i=0; i < posicaoI.size(); i++) {
                System.out.println(String.format("Posição I = %d e J = %d. ", posicaoI.get(i), posicaoJ.get(i)));
            }
            System.out.println("--------------------------");

        }
    }
}
