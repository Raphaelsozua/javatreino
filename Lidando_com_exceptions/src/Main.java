import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int divisao(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean op = true;

        do {
            try{
                System.out.println("Numerador: ");
                int numerador = scan.nextInt();
                System.out.println("Denominador: ");
                int denominadror = scan.nextInt();

                int result = divisao(numerador, denominadror);
                System.out.println("Resultado: " + result);

                op = false;
            }catch (InputMismatchException imputMismatchException){
                System.out.println("Resultado: "+ imputMismatchException);
                scan.nextLine();
                System.out.println("Voce deve digitar ineiros");
            }catch (ArithmeticException arithmeticException)
            {
                System.out.println("Execeção: " + arithmeticException);
                System.out.println("zero é um valor invalidade para o denominador");
            }

        }
        while (op);


    }

}