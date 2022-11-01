public class Internet extends  OtherPayments{


    private int monthlySub;
    private int internetRate;

    public int getMonthlySub() {
        return monthlySub;
    }

    public void setMonthlySub(int monthlySub) {
        this.monthlySub = monthlySub;
    }

    public int getInternetRate() {
        return internetRate;
    }

    public void setInternetRate(int internetRate) {
        this.internetRate = internetRate;
    }

    public Internet(int monthlySub, int internetRate) {
        this.monthlySub = monthlySub;
        this.internetRate = internetRate;
    }


    @Override
    public int getPayment() {
        return this.internetRate * this.monthlySub;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getTax() {
        return 0;
    }
}
