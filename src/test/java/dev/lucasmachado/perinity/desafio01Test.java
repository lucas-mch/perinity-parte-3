package dev.lucasmachado.perinity;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static dev.lucasmachado.perinity.desafio01.getResposta;
import static dev.lucasmachado.perinity.desafio01.testeDeMesa;
import static org.junit.Assert.assertEquals;

public class desafio01Test {

    @Test
    public void testGetRespostaA() {
        int z = -10;
        char resposta = getResposta(z);
        assertEquals('A', resposta);
    }

    @Test
    public void testGetRespostaB() {
        int z = 50;
        char resposta = getResposta(z);
        assertEquals('B', resposta);
    }

    @Test
    public void testGetRespostaC() {
        int z = 150;
        char resposta = getResposta(z);
        assertEquals('C', resposta);
    }

    @Test
    public void testeDeMesaA() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testeDeMesa(-2, 5);

        String output = outputStream.toString().trim();
        assertEquals('A', output.charAt(0));
    }

    @Test
    public void testeDeMesaB() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testeDeMesa(5, 2);

        String output = outputStream.toString().trim();
        assertEquals('B', output.charAt(0));
    }

    @Test
    public void testeDeMesaC() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testeDeMesa(10, 10);

        String output = outputStream.toString().trim();
        assertEquals('C', output.charAt(0));
    }


}
