public class Retangulo extends Poligono{
    public Retangulo(double altura, double base) {
        super(altura, base);
    }

    @Override
    public double getArea() {
        return (getBase()* getAltura())/2;
    }

    @Override
    public void imprimir() {
        System.out.println(getArea());
    }


}
