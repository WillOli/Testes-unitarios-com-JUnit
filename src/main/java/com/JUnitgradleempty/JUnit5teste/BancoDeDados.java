package com.JUnitgradleempty.JUnit5teste;

import org.apache.commons.logging.Log;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // faz algo
        LOGGER.info("Iniciou a conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Fim da conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        // insere pessoa no BD
        LOGGER.info("Inseriu pessoa");
    }

    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("removeu dados");
    }
}
