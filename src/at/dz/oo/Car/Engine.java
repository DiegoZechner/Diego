package at.dz.oo.Car;

public class Engine {
    public enum TYPE {Diesel,GAS}
    public int horsePower;
    private TYPE type;




    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    // amount should be between 0 and 100

    public void drive(int amount) {
        System.out.println("The engine is running " + amount + "km/h max speed");

    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }





}
