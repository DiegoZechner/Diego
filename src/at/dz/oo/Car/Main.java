package at.dz.oo.Car;

public class Main {
    public static void main(String[] args) {

        // create Engine
        Engine e1 = new Engine(140, Engine.TYPE.Diesel,200,100);

        Tank t1 = new Tank(50,50,10);

        // Refactoring
        Car c2 = new Car(e1,t1,"Ferrari", "F40",240,100,5);

        e1.drive();

        t1.getRemainingRange();

        t1.turboBoost();



        /* c2.brake();
        System.out.println();
        c2.turboBoost();

        c2.honk();
        System.out.println();
        c2.getRemainingRange();
        */




    }

}
