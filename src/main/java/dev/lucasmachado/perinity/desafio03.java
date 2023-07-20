package dev.lucasmachado.perinity;

public class desafio03 {

    public static void sequenciaDeNumeros() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")");
        }
    }
}
