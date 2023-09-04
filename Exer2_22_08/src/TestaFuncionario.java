import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestaFuncionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do funcionario");
        String nome = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome);

        System.out.println("digite o nome do assistente");
        String nomea = sc.nextLine();

        System.out.println("digite a matricula do funcionario");
        int matricula = sc.nextInt();

        Assistente assistente = new Assistente(nomea, matricula);

        funcionario.imprimir();
        assistente.imprimir();
    }
}