package at.dz.oo.Car;

public class Main {
    public static void main(String[] args) {

        // create Engine Tank Car
        Engine e1 = new Engine(140, Engine.TYPE.Diesel,200,100);

        Tank t1 = new Tank(50,50,10);

        RearMirror r1 = new RearMirror(100,10);
        RearMirror r2 = new RearMirror(100,-40);

        Wheel w1 = new Wheel(2.5, Wheel.season.Winter,19);
        Wheel w2 = new Wheel(2.5, Wheel.season.Winter,19);
        Wheel w3 = new Wheel(3, Wheel.season.Winter,20);
        Wheel w4 = new Wheel(3, Wheel.season.Winter,20);


        Car c2 = new Car(e1,t1,"Ferrari", "F40",240,100,5);

        e1.drive();

        t1.getRemainingRange();

        t1.turboBoost();

        c2.addMirror(r1);
        c2.addMirror(r2);


        System.out.println("Left Mirror Position: " + c2.getMirrors().get(0).getPosition() + "  Left Mirror size: " + c2.getMirrors().get(0).getSize());
        System.out.println("Right Mirror Position: " + c2.getMirrors().get(1).getPosition() + "  Right Mirror size: " + c2.getMirrors().get(1).getSize());
    }

}
