package com.JUnitgradleempty.JUnit5teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExecptionTeste {

    @Test
    void validarCenarioDeExececaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("78974", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
