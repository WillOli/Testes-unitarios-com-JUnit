package com.JUnitgradleempty.JUnit5teste;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamento() {
        Pessoa William =  new Pessoa("William", LocalDateTime.of(2001, 1, 1, 10, 0, 0));
        assertEquals(22, William.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa William =  new Pessoa("William", LocalDateTime.of(2001, 1, 1, 10, 0, 0));
        assertTrue(William.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("joao", LocalDateTime.now());
        assertFalse(joao.ehMaiorDeIdade());
    }
}


