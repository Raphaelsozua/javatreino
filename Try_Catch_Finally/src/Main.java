// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try{
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e){
            System.out.println("Exceção: "+ e);
            System.out.println("A frase inicial esta nula, foi inserido um valor default");

            frase = "Frase vazia";
        }
        finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Nova frase: " + novaFrase);
    }
}