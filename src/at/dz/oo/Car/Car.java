package at.dz.oo.Car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public int amountOfRepetitions;
    private int speed;
    private int brake;
    private String brand;
    private String serialNumber;
    private Engine engine;
    private  Tank tank;
    private List<RearMirror> mirrors;



    public Car(Engine engine,Tank tank, String brand, String serialNumber, int speed, int brake, int amountOfRepetitions) {
        this.engine = engine;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.speed = speed;
        this.brake = brake;
        this.amountOfRepetitions = amountOfRepetitions;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
            this.mirrors.add(rearMirror);
    }
    public List<RearMirror> getMirrors(){
        return mirrors;
    }


    public void brake() {
        this.speed = this.speed - brake;
        System.out.println("I am braking ");
        System.out.println("braking");
        System.out.println();
        System.out.println("Speed " + this.speed + " km/h");
    }



    public void honk() {
        for (int i = 0; i < getAmountOfRepetitions(); i++) {
            System.out.println("Tuuut ");

        }
    }

    // Engine

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTank(Tank tank) {this.tank = tank;}

    public Tank getTank() {return tank;}

    //  SETTER & GETTER

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

