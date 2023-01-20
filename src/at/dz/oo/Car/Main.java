package at.dz.oo.Car;

public class Main {
    public static void main(String[] args) {
    /*
        Car c1 = new Car();
        c1.y = "BMW";
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
        // create Engine
        Engine e1 = new Engine(140, Engine.TYPE.Diesel);

        // Refactoring
        Car c2 = new Car(e1,50, 100, "Ferrari", "F40", 0, 120, 100, 2);
        c2.dashboard();
        e1.getHorsePower();
        System.out.println();
        e1.drive(120);
        c2.drive();

        /* c2.brake();
        System.out.println();
        c2.turboBoost();

        c2.honk();
        System.out.println();
        c2.getRemainingRange();
        */




    }

}
