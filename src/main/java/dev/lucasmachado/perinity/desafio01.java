package dev.lucasmachado.perinity;

import java.util.InputMismatchException;
import java.util.Scanner;

import static dev.lucasmachado.Utils.scannerInteger;

public class desafio01 {

    private static Scanner sc = new Scanner(System.in);

    public static void testeDeMesa() {
        Integer x = scannerInteger("x");
        Integer y = scannerInteger("y");
        Integer z = (x * y) + 5;
        char resposta = getResposta(z);
        System.out.println(resposta);
    }

    //for unit tests
    public static void testeDeMesa(Integer x, Integer y) {
        Integer z = (x * y) + 5;
        char resposta = getResposta(z);
        System.out.println(resposta);
    }

    public static char getResposta(Integer z) {
        char resposta;
        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }
        return resposta;
    }

}
