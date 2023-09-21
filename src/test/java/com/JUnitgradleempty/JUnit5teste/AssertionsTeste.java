package com.JUnitgradleempty.JUnit5teste;



import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {
    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5 , 2, 3, 10};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        // Essa função comparar se é diferente
//        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Wellington", LocalDateTime.now());

        assertNotNull(pessoa);
    }

}
