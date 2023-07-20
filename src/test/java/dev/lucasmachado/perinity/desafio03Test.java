package dev.lucasmachado.perinity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class desafio03Test {

    @Test
    public void testSequences() {

        String[] expected = {
                "(1, 1 2 3 4 5 6 7 8 9 10 )",
                "(3, 1 2 3 4 5 6 7 8 9 10 )",
                "(5, 1 2 3 4 5 6 7 8 9 10 )",
                "(7, 1 2 3 4 5 6 7 8 9 10 )",
                "(9, 1 2 3 4 5 6 7 8 9 10 )"
        };

            java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
            System.setOut(new java.io.PrintStream(outContent));
            desafio03.sequenciaDeNumeros();
            String[] actual = outContent.toString().replace("\r", "").split("\n");

        for (int i = 0; i < 5; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

}
