public class Electricity extends OtherPayments {

    private int units;
    private  int unitsRate;


    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getUnitsRate() {
        return unitsRate;
    }

    public void setUnitsRate(int unitsRate) {
        this.unitsRate = unitsRate;
    }

    public Electricity(int units, int unitsRate) {
        this.units = units;
        this.unitsRate = unitsRate;
    }


    @Override
    public int getPayment() {
        return this.units * this.unitsRate;
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
