public class Calculadora {
    private String entrada;
    private int resultado;

    public Calculadora() {

    }
    public Calculadora(int value1, char op, int value2) {

    }

    public void receberEntrada(String calcs) {
        entrada = calcs;
    }

    public int identificarOperacao(int value1, char op, int value2) {
        resultado = value1 + op + value2;
        return resultado;
    }


    public void limparCampo(){

    }
}
