public class Rental extends OtherPayments {


    private int monthlyRental;
    private int rentalRate;

    public int getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(int monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }


    public Rental(int monthlyRental, int rentalRate) {
        this.monthlyRental = monthlyRental;
        this.rentalRate = rentalRate;
    }

    @Override
    public int getPayment() {
        return this.monthlyRental * this.rentalRate;
    }

    @Override
    public double getTax() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
