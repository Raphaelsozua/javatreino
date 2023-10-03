import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros =  new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int soma =0;
        for (int i = 0; i <15 ; i++) {
            System.out.println("Digite um numero inteiro");
            int num = sc.nextInt();

            numeros.add(num);


            if (num > maior){
                maior = num;
            }
            soma = soma + numeros.get(i);
        }
        int result = soma * maior;

        System.out.println("soma: " + soma);
        System.out.println("maior: "+ maior);
        System.out.println(result);


    }
}