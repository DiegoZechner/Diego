package at.dz.oo.Car;

public class Main {
    public static void main(String[] args){

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.fuelConsumption = 10;
        c1.serialNumber = "E30";
        c1.fuelAmount = 100;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 8;
        c2.serialNumber = "A-Klasse";
        c2.fuelAmount = 64;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

    }

}
