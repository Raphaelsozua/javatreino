public abstract class Employee {
    private String firstName;

    private String lastName;

    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString(){
        return ("Nome: "+ getFirstName() + " " +getLastName() +
                "\nocial security number: "+ getSocialSecurityNumber());
    }
    public abstract double earnings();
}
