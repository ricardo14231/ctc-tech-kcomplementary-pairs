package com.ricardofarias.ctc.main;

import com.ricardofarias.ctc.model.KComplementary;
import com.ricardofarias.ctc.utils.KComplementaryBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KComplementaryMainTest {

    @Test
    @DisplayName("Retorna 0 KComplementary.")
    void deveRetornar_ZeroKComplemntary() {
        KComplementary kComplementary = KComplementaryBuilder.criaZeroKComplementary();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Retorna 3 KComplementary.")
    void deveRetornar_tresKComplemntary() {
        KComplementary kComplementary = KComplementaryBuilder.criaTresKComplementary();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Retorna 5 KComplementary.")
    void deveRetornar_CincoKComplemntary() {
        KComplementary kComplementary = KComplementaryBuilder.criaCincoKComplementary();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Retorna 0 KComplementary ao informar array vazio.")
    void deveRetornar_ZeroKComplemntary_aoInformarArrayVazio() {
        KComplementary kComplementary = KComplementaryBuilder.criaKComplementaryComArrayVazio();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Retorna 0 KComplementary ao informar K igual a zero.")
    void deveRetornar_ZeroKComplemntary_aoInformarKigualZero() {
        KComplementary kComplementary = KComplementaryBuilder.criaKComplementaryComKIgualZero();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(0, resultado);
    }

    @Test
    @DisplayName("Retorna 0 KComplementary ao informar K igual nullo.")
    void deveRetornar_ZeroKComplemntary_aoInformarKigualNullo() {
        KComplementary kComplementary = KComplementaryBuilder.criaKComplementaryNullo();

        int resultado = kComplementary.verificaKComplementary();

        Assertions.assertEquals(0, resultado);
    }
}