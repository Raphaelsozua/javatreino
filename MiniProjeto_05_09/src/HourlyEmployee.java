public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage){
        this.wage = wage;
    }
    public double getWage(){
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings(){
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
    @Override
    public String toString(){
        return ("---Relatorio---\n" +
                super.toString() + "\n" +
                "Quantidade de horas trabalhadas: "+ getHours() + "\n" +
                "Valor de hora trabalhada R$: " + getWage());
    }
}
