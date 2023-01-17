package at.dz.oo.Car;

public class Car {
    public int amountOfRepetitions;
    private int fuelConsumption;
    private int fuelAmount;
    private int tank;
    private int speed;
    private int accelerate;
    private int brake;
    private String brand;
    private String serialNumber;
    private Engine engine;



    public Car(Engine engine, int fuelConsumption, int fuelAmount, String brand, String serialNumber, int speed, int accelerate, int brake, int amountOfRepetitions) {
        this.engine = engine;
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
    public void dashboard() {
        System.out.println("Tank-Status " + this.fuelAmount + "l");
        System.out.println("Speed " + this.speed + "km/h");
    }


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
        if (getFuelAmount() > (getTank() * 0.1))
            System.out.println("SuperBoost Mode");
        else
            System.out.println("Not enough fuel to go to Superboost");
        System.out.println(" ");
    }

    public void honk() {
        for (int i = 0; i < getAmountOfRepetitions(); i++) {
            System.out.println("Tuuut ");

        }
    }


    public int getRemainingRange() {
        int remaining = getFuelAmount() / getFuelConsumption();
        System.out.println("So oft kannst du noch fahren " + remaining);
        return remaining;
    }
    // Engine

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    //  SETTER & GETTER

    public int getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

