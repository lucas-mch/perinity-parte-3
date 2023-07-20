package dev.lucasmachado.perinity;

import static dev.lucasmachado.Utils.scannerInteger;

public class desafio02 {

    public static void somaProdutoIdades() {

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = scannerInteger("Idade");
        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomem2 = scannerInteger("Idade");

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scannerInteger("Idade");
        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scannerInteger("Idade");

        int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);

        System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produtoIdades);

    }

    //to Tests
    public static void somaProdutoIdades(Integer idadeHomem1, Integer idadeHomem2, Integer idadeMulher1, Integer idadeMulher2) {

        int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);

        System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produtoIdades);

    }

}
