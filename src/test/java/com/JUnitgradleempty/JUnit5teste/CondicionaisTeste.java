package com.JUnitgradleempty.JUnit5teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.MAC)
    void validarAlgoSomeneteNOUsuarioWilliam() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
