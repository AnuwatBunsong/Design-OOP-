public class Driver implements iPayment {

    private  int noOfTrip;
    private   int rate;
    private  String driverName;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    public int getNoOfTrip() {
        return noOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        this.noOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Driver(int noOfTrip, int rate , String driverName){
        this.noOfTrip = noOfTrip;
        this.rate = rate;
        this.driverName = driverName;

    }


    @Override
    public int getPayment() {
        return this.noOfTrip * this.rate;
    }

    @Override
    public String getName() {
        return this.driverName;
    }

    @Override
    public double getTax() {
        return 0;
    }
}
