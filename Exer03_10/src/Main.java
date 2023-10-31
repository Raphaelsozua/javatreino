// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        System.out.println("Fim do main");

        try{
            metodo1();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: "+ e);
        }
    }
    public static void metodo1(){
        System.out.println("Inicio do metodo");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    public static void metodo2(){
        System.out.println("inicio do metodo 2");
        int Array[] = new int[10];

        for (int i = 0; i <= 15; i++){
            Array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do metodo 2");
    }
}