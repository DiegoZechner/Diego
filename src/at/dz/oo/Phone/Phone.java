package at.dz.oo.Phone;

public class Phone {

    private String name;
    private String color;
    private SIM sim;
    private Camera camera;
    private SD_Memory sdMemory;
    private String phoneNumber;

    public Phone(String name, String color, SIM sim, Camera camera, SD_Memory sdMemory) {
        this.name = name;
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdMemory = sdMemory;
        this.phoneNumber = "";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String setColor() {
        return color;
    }


    public void makeCall() {
        if (phoneNumber.equals("---------")) {
            System.out.println("Bitte geben Sie zuerst eine Telefonnummer ein.");
        } else {
            System.out.println("Anruf an " + phoneNumber + " wird getätigt...");
        }
    }

    public void takePicture(){
        Phonefile file = this.camera.makePicture();
        this.sdMemory.save(file);
    }
}


