package dev.lucasmachado;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static dev.lucasmachado.Utils.scannerInteger;
import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void deveLancarExceptionInputDiferenteInteger() {
        String input = "deve 1";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        scannerInteger("Valor");

        String output = outputStream.toString().replace("\r","").trim();
        String[] lines = output.split("\n");

        assertEquals("Valor deve ser um número inteiro, por favor tente novamente!", lines[0]);
    }

}
