package dev.lucasmachado.perinity;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static dev.lucasmachado.perinity.desafio02.somaProdutoIdades;
import static org.junit.Assert.assertEquals;

public class desafio02Test {

    @Test
    public void testSomaProdutoIdades() {
        String input = "30\n25\n22\n28\n"; // Valores das idades simulados para o teste
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream); // Redirecionar a entrada padrão para o inputStream simulado

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirecionar a saída padrão para o outputStream

        somaProdutoIdades(30, 25, 22, 28);

        String output = outputStream.toString().replace("\r","").trim();
        String[] lines = output.split("\n");

        assertEquals("A soma da idade do homem mais velho com a mulher mais nova é: 52", lines[0]);
        assertEquals("O produto da idade do homem mais novo com a mulher mais velha é: 700", lines[1]);
    }

}
