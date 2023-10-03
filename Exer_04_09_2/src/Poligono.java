public abstract class Poligono {
    private double altura;
    private double base;

    public Poligono(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public abstract double getArea();

    public abstract void imprimir();
}
