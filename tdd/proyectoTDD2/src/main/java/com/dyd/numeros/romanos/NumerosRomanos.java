package com.dyd.numeros.romanos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private final static List<String> simbolosRomanos = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertirAromanos(Integer numeroNatural) {

        char[] numerosChart = numeroNatural.toString().toCharArray();

        int incremento = 0;
        String resultado = "";

        for (int i = numerosChart.length - 1; i >= 0; i--) {
            String romano = generico(Character.getNumericValue(numerosChart[i]), 0 + incremento, 1 + incremento, 2 + incremento);

            resultado = romano + resultado;
            incremento += 2;
        }

        return resultado;
    }

    private String generico(int decena, int x, int y, int z) {
        switch (decena) {
            case 4:
                return simbolosRomanos.get(x) + simbolosRomanos.get(y);
            case 9:
                return simbolosRomanos.get(x) + simbolosRomanos.get(z);
        }

        if (decena <= 3)
            return sumar(1, decena, "", simbolosRomanos.get(x));

        if (decena <= 8)
            return sumar(6, decena, simbolosRomanos.get(y), simbolosRomanos.get(x));

        return null;
    }

    private String sumar(int inicioCuenta, int numerNatural, String inicioNumeroRomano, String incrementoRomano) {
        for (int i = inicioCuenta; i <= numerNatural; i++) {
            inicioNumeroRomano += incrementoRomano;
        }
        return inicioNumeroRomano;
    }
}
