import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int value1 = 0;
    String valores = "1+1";

    @Test
    void receberEntrada() {
        Calculadora c = new Calculadora();
        assertNotNull(valores);
    }

    @Test
    void identificarOperacao() {
    }

    @Test
    void limparCampo() {
    }
}