public class Cleaner implements iPayment {

    private  int dayOfWork;
    private  int rate;
    private  String cleanerName;

    public Cleaner(int dayOfWork, int rate, String cleanerName) {
        this.dayOfWork = dayOfWork;
        this.rate = rate;
        this.cleanerName = cleanerName;
    }

    public int getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }


    @Override
    public int getPayment() {
        return this.dayOfWork * this.rate;
    }

    @Override
    public double getTax() {
        return 0;
    }
    @Override
    public String getName() {
        return this.cleanerName;
    }
}
