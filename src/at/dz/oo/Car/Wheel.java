package at.dz.oo.Car;

public class Wheel {

    private double pressure;
    public enum season {Winter,Summer}
    private int size;
    private season type;


    public Wheel(double pressure,season type ,int size){
        this.pressure = pressure;       //Bar
        this.type = type;           //Winter Sommer
        this.size = size;       // Zoll
    }

    public int getSize() { return size;
    }
    public double getPressure(){ return pressure;
    }
    public season getType(){ return type;
    }
}
