package at.dz.oo.Car;

public class Engine {
    public enum TYPE {Diesel,GAS}
    public int horsePower;
    private TYPE type;
    public int maxspeed;
    public int gas;




    public Engine(int horsePower, TYPE type, int maxspeed, int gas) {
        this.horsePower = horsePower;
        this.type = type;
        this.maxspeed = maxspeed;
        this.gas = gas;
    }

    // amount should be between 0 and 100%
    public void drive() {
        if( gas > 100){
            gas = 100;}
        else{
            int i = gas * maxspeed / 100;
            System.out.println("current Speed "+ i +"km/h   "+ gas + "% Gas");}


    }


    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }






}
