package com.JUnitgradleempty.JUnit5teste;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");

        }
        contaDestino.lancaCredito(valor);
        contaOrigem.lancaCredito(valor);
    }
}
