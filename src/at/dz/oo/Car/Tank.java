package at.dz.oo.Car;

public class Tank {
    private int fuelamount;
    private int fuelconsumption;
    private int fuelvolume;

    public Tank(int fuelamount, int fuelvolume, int fuelconsumption){

        this.fuelamount = fuelamount;
        this.fuelconsumption = fuelconsumption;
        this.fuelvolume = fuelvolume;
    }

    public int getRemainingRange() {
        int remaining = this.fuelamount / this.fuelconsumption;
        System.out.println("So oft kannst du noch fahren " + remaining);
        return remaining;
    }
    public void turboBoost() {
        if (this.fuelamount - this.fuelconsumption > (this.fuelvolume * 0.1))
            System.out.println("SuperBoost Mode");
        else
            System.out.println("Not enough fuel to go to Superboost");
        System.out.println(" ");
    }
}