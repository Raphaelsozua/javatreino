public class SalariedEmployee extends Employee{

    private double weeklysalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklysalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklysalary = weeklysalary;
    }

    public double getWeeklysalary() {
        return weeklysalary;
    }

    public void setWeeklysalary(double weeklysalary) {
        this.weeklysalary = weeklysalary;
    }

    @Override
    public double earnings(){
        return getWeeklysalary();
    }

    @Override
    public String toString(){
        return ("---Relatorio---\n" + super.toString() +
                "\n" + "salario smanal: R$"+getWeeklysalary());
    }
}
