public class Classe1 {

    private int valor;

    public Classe1(int n){
        valor = n;
    }
    public void f(int x) throws Exception, ArithmeticException{
        if ( x<0)
            throw new Exception("Erro - argumento" + x);
        System.out.println(x/(valor - 100));
    }
}
