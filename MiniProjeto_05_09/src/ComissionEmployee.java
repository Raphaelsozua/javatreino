public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    @Override
    public double earnings(){
        return getComissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return ("---Relatorio---\n" +
                super.toString() + "\n" +
                "Valor das vendas semanais: " + getGrossSales() + "\n" +
                "porcentagem da comissão (%): "+getComissionRate());
    }

}
