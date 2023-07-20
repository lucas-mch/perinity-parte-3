package dev.lucasmachado;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class UtilsTest {

    @Test
    public void deveLancarExceptionInputDiferenteInteger(){
        String input = "30\n25\n22\n28\n"; // Valores das idades simulados para o teste
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream); // Redirecionar a entrada padrão para o inputStream simulado

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirecionar a saída padrão para o outputStream
    }

}
