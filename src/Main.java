import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<iPayment> staffs = new ArrayList<iPayment>();
        CEO ceoOne = new CEO("Krit",10000000,20,1000000);
        staffs.add(ceoOne);
        Developer devOne = new Developer("Bank",50000,20,5000);
        staffs.add(devOne);
        Marketing marketingOne = new Marketing("Ya",30000,4,1000);
        staffs.add(marketingOne);

        //Add a driver
        Driver driverOne = new Driver(500,50,"NONPAWIT");
        staffs.add(driverOne);

        //Add a cleaner
        Cleaner cleanerOne = new Cleaner(20,20000, "BOB");
        staffs.add(cleanerOne);

        Rental rentalOne = new Rental(12,20000);
        staffs.add(rentalOne);

        Electricity electricOneMonth = new Electricity(300,7);
        staffs.add(electricOneMonth);

        Internet subscriptionOneMonth = new Internet(12,10000);
        staffs.add(subscriptionOneMonth);

        int totalSalaryStaffs = ceoOne.getPayment() + devOne.getPayment() + marketingOne.getPayment() + driverOne.getPayment() + cleanerOne.getPayment();


        CalculateTax calTax = new CalculateTax(totalSalaryStaffs);
        staffs.add(calTax);


        int iPayment = 0;
        for (iPayment staff : staffs) {

//            System.out.println(staff.getName() + " = " + staff.getPayment());
            iPayment += staff.getPayment();
//            System.out.println("Total Payment: " + iPayment);
        }

        System.out.println( "Total of Salary Staffs : " +totalSalaryStaffs);

        double tax = calTax.getTax();
        System.out.println("Total Tax : " + tax);

        System.out.println("Total Payment: " + iPayment);



    }
}