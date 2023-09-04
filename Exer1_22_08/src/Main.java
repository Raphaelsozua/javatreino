import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o saldo inicial da conta poupança: ");
        double saldo = sc.nextDouble();
        ContaPoupanca conta1 = new ContaPoupanca(saldo);

        System.out.println("Digite o saldo inicial da conta corrente");
        double saldo2 = sc.nextDouble();
        ContaCorrente conta2 = new ContaCorrente(saldo2);

        System.out.println("Saldo da conta poupança: "+ conta1.getSaldo());
        System.out.println("Saldo da conta corrente: "+ conta2.getSaldo());

        System.out.println("Digite o saldo a depositar na conta poupança");
        double depositoPoupanca = sc.nextDouble();
        conta1.depositar(depositoPoupanca);

        System.out.println("Digite o saldo a depositar na conta corrente");
        double depositoCorrente = sc.nextDouble();
        conta2.depositar(depositoCorrente);

        System.out.println("Digite a taxa de atualização: ");
        double taxa = sc.nextDouble();

        System.out.println("Saldo da conta poupança antes da correção de taxas: "+ conta1.getSaldo());
        System.out.println("Saldo da conta corrente antes da correção de taxas: "+ conta2.getSaldo());

        conta1.atualizaTaxa(taxa);
        conta2.atualizaTaxa(taxa);

        System.out.println("Saldo da conta poupança apos a correção de taxas: "+ conta1.getSaldo());
        System.out.println("Saldo da conta corrente apos a correção de taxas: "+ conta2.getSaldo());





    }
}