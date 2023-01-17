package at.dz.oo.Car;

public class Car {
    private int fuelConsumption;
    private int fuelAmount;
    private int tank;
    private int speed;
    private int accelerate;
    private int brake;
    private String brand;
    private String serialNumber;
    public int amountOfRepetitions;


    public Car(int fuelConsumption,int fuelAmount,String brand,String serialNumber,int speed, int accelerate, int brake, int amountOfRepetitions){
            this.fuelConsumption = fuelConsumption;
            this.fuelAmount = fuelAmount;
            this.brand = brand;
            this.serialNumber = serialNumber;
            this.speed = speed;
            this.accelerate = accelerate;
            this.brake = brake;
            this.amountOfRepetitions = amountOfRepetitions;
    }

    //Methode
    public void dashboard (){
        System.out.println("Tank-Status " + this.fuelAmount + "l");
        System.out.println("Speed " + this.speed + "km/h");}


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
        System.out.println("braking");
        System.out.println();
        System.out.println("Speed " + this.speed + " km/h");
    }

    public void turboBoost() {
        if (this.fuelAmount > (this.tank * 0.1))
            System.out.println("SuperBoost Mode");
        else
            System.out.println("Not enough fuel to go to Superboost");
        System.out.println(" ");
    }

    public void honk() {
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
