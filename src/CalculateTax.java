
public class CalculateTax implements  iPayment{

    protected double salary;

    public CalculateTax(double salary) {
        this.salary = salary  ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary ;
    }

    @Override
    public int getPayment() {
        return 0;
    }

    @Override
    public double getTax() {
        return this.salary * (15.0/100.0) ;
    }

    @Override
    public String getName() {
        return null;
    }
}
