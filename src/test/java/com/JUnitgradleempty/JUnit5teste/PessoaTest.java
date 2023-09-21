package com.JUnitgradleempty.JUnit5teste;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamento() {
        Pessoa William =  new Pessoa("William", LocalDateTime.of(2001, 1, 1, 10, 0, 0));
        Assertions.assertEquals(22, William.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa William =  new Pessoa("William", LocalDateTime.of(2001, 1, 1, 10, 0, 0));
        Assertions.assertTrue(William.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}


