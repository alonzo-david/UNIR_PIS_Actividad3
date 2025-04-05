/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Modelo.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dajua
 */
public class CalculadoraTest {
    
    private final Calculadora calculadora = new Calculadora();

    
    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), 0.001);
        assertEquals(-1, calculadora.sumar(-2, 1), 0.001);
        assertEquals(0, calculadora.sumar(-3, 3), 0.001);
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), 0.001);
        assertEquals(-3, calculadora.restar(-2, 1), 0.001);
        assertEquals(0, calculadora.restar(3, 3), 0.001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3), 0.001);
        assertEquals(-2, calculadora.multiplicar(-2, 1), 0.001);
        assertEquals(0, calculadora.multiplicar(0, 3), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3), 0.001);
        assertEquals(-2, calculadora.dividir(-6, 3), 0.001);
        assertEquals(0, calculadora.dividir(0, 3), 0.001);
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
