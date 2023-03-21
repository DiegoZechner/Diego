package at.dz.oo.Phone;

public class main {
    public static void main(String[]args) {


        SIM s1 = new SIM(1, "9876");
        SD_Memory sd1 = new SD_Memory(50000);
        Camera camera2 = new Camera(1080);
        Phone phone = new Phone("Android", "green", s1, camera2, sd1);

        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();
    }
}

