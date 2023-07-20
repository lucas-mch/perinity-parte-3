package dev.lucasmachado;

import static dev.lucasmachado.perinity.desafio01.testeDeMesa;
import static dev.lucasmachado.perinity.desafio02.somaProdutoIdades;
import static dev.lucasmachado.perinity.desafio03.sequenciaDeNumeros;
import static dev.lucasmachado.perinity.desafio04.mergeAndSortTwoIntegerArray;

public class Main {

    public static void main(String[] args) {
        testeDeMesa();
        somaProdutoIdades();
        sequenciaDeNumeros();
        mergeAndSortTwoIntegerArray(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6});
    }

}