package at.dz.oo.Camera;

import java.util.Scanner;



public class Camera {
    private int resolutionLevel;
    private int name;
    private int counter;
    Scanner scan = new Scanner(System.in);

    public Camera(){
        this.counter = 999;
        this.name = this.counter;
    }

    public Storage setResolutionLevel() {
        System.out.println("Bitte geben Sie die Auflösungsstufe ein (1-3):");
        int level = scan.nextInt();
        switch (level) {
            case 1:
                this.resolutionLevel = 1;
                System.out.println("Niedrig - 2GB");
                break;
            case 2:
                this.resolutionLevel = 2;
                System.out.println("Mittel - 4GB");
                break;
            case 3:
                this.resolutionLevel = 3;
                System.out.println("Hoch - 6GB");
                break;
            default:
                System.out.println("Keine gültige Auflösungsstufe");
        }
        return null;
    }



    public void takePicture() {
        this.counter++;
        this.name = this.counter;
        System.out.println("Bild mit Auflösungsstufe " + resolutionLevel + " aufgenommen " + name + " - jpg");
    }

    public int getResolutionLevel() {
        return this.resolutionLevel;
    }

    public void size() {

    }


}