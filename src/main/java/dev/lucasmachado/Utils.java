package dev.lucasmachado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    private static Scanner sc = new Scanner(System.in);

    public static Integer scannerInteger(String variableName) {
        Integer input = null;
        while (input == null) {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println(variableName + " deve ser um número inteiro, por favor tente novamente!");
            }
        }
        return input;
    }

}
