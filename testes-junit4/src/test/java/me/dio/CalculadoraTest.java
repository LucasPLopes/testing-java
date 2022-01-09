package me.dio;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest{

    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();

        int valorEsperado = 6;
        int soma = calc.somar("1+2+3");

        assertEquals(valorEsperado, soma);
    }
}