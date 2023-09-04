

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Teste {
    public static void main(String[] args) {
    Funcionario f1 = new Gerente();
    f1.setCodigo(1);

    ControlePonto controle_ponto = new ControlePonto();
    controle_ponto.registrarEntrada(f1);
    controle_ponto.registrarSaida(f1);

    Funcionario f2 = new Telefonista();
    f2.setCodigo(2);

    controle_ponto.registrarEntrada(f2);
    controle_ponto.registrarSaida(f2);
    }
}