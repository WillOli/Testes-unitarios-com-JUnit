package com.JUnitgradleempty.JUnit5teste;
import org.junit.jupiter.api.*;
import org.springframework.util.backoff.BackOff;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Wellington", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Wellington", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }


    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}
