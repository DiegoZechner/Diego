package at.dz.oo.Phone;

public class SIM {
    private int id;
    private String number;



    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public String call(String number) {
        System.out.println("SIM " + id + " calls " + this.number);
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }


}
