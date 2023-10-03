public class Quadrado extends Poligono{
    public Quadrado(double altura, double base) {
        super(altura, base);
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public void imprimir() {
        System.out.println(getArea());
    }
}
