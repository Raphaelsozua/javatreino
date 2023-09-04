import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int chute = 0;

        int tentativas = 0;
        int num = random.nextInt(100);

        while (tentativas < 5){
            System.out.println(" Digite um numero aleatorio");
            chute = sc.nextInt();
            tentativas ++;
            if (chute == num){
                System.out.println("parabens voçê acertou");
                break;
            }
            else {
                if (chute < num){
                    System.out.println("o numero aleatorio é maior");
                } else if (chute > num) {
                    System.out.println("o numero aleatorio é menor");
                }
            }

        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + num);
        }



    }
}