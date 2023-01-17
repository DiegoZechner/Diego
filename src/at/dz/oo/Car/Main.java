package at.dz.oo.Car;

public class Main {
    public static void main(String[] args) {
    /*
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.fuelConsumption = 10;
        c1.serialNumber = "E30";
        c1.fuelAmount = 50;
        c1.speed = 0;
        c1.accelerate = 80;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 5;
        c2.serialNumber = "A-Klasse";
        c2.fuelAmount = 15;
        c2.tank = 30;
        c2.speed = 0;
        c2.accelerate = 40;
        c2.brake = 20;
    */
        // Refactoring
        Car c2 = new Car(100,100, "Ferrari", "F40",0,120, 100,2);
        c2.dashboard();
        System.out.println();
        c2.drive();

        c2.brake();
        System.out.println();
        c2.turboBoost();

        c2.honk();
        System.out.println();
        c2.getRemainingRange();

    }

}
