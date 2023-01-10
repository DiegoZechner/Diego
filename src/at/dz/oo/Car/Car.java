package at.dz.oo.Car;

public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public int tank;
    public String brand;
    public String serialNumber;
    private String color;
    public int speed;
    public int accelerate;
    public int brake;

    public Car(int fuelConsumption,int fuelAmount,String brand,String serialNumber){
            this.fuelConsumption = fuelConsumption;
            this.fuelAmount = fuelAmount;
            this.brand = brand;
            this.serialNumber = serialNumber;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving ");
        this.accelerate = this.speed + accelerate;
        System.out.println(" ");
        System.out.println("Tank-Status after driving " + this.fuelAmount + "l");
        System.out.println("Speed " + this.accelerate + "km/h");
        System.out.println(" ");
    }

    public void brake() {
        this.speed = this.accelerate - brake;
        System.out.println("I am braking ");
        System.out.println("braking " + this.speed + "km/h");
    }

    public void turboBoost() {
        if (this.fuelAmount > (this.tank * 0.1))
            System.out.println("SuperBoost Mode");
        else
            System.out.println("Not enough fuel to go to Superboost");
        System.out.println(" ");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut ");

        }
    }


    public int getRemainingRange() {
        int remaining = this.fuelAmount / this.fuelConsumption;
        System.out.println("So oft kannst du noch fahren " + remaining);
        return remaining;
    }


}
