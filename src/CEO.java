public class CEO extends Staff {

    private int experience;
    private int experienceRate;



    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperienceRate() {
        return experienceRate;
    }

    public void setExperienceRate(int experienceRate) {
        this.experienceRate = experienceRate;
    }

    public CEO(String name, int salary, int experience, int experienceRate) {
        super(name, salary);
        this.experience = experience;
        this.experienceRate = experienceRate;
    }

    @Override
    public int getPayment() {
        return this.salary + (this.experience * this.experienceRate);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
