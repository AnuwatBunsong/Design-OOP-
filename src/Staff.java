public abstract class Staff implements iPayment{

    protected int salary;
    protected String name;


    public Staff(String name, int salary) {
        this.salary = salary;
        this.name = name;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract int getPayment ();
}
