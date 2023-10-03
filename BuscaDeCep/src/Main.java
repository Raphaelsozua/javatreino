
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consulta consulta = new Consulta();

        System.out.println("Digite o numero do CEP: ");
        var cep = sc.nextLine();

        try{
            Endereço endereço = consulta.buscaEndereco(cep);
            System.out.println(endereço);
            GeraArquivo geraArquivo = new GeraArquivo();
            geraArquivo.geraJson(endereço);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando");
        }



    }
}