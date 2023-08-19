import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double deposito = 0;
        double transferencia = 0;

        System.out.println("**************");
        System.out.println("operações");
        System.out.println("1- Consultar dados");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- sair");


        while (opcao != 4) {
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("consultar dados: ");
                System.out.println("Nome: " + nome);
                System.out.println("Tipo de Conta: " + tipoDeConta);
                System.out.println("Saldo: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber");
                deposito = sc.nextDouble();

                saldo += deposito;

                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor a transferir");
                transferencia = sc.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("saldo insuficiente para a transferencia");
                } else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }

            }
        }
    }
}