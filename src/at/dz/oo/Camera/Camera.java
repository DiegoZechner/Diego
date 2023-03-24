package at.dz.oo.Camera;

import java.util.Scanner;

public class Camera {
    private int resolutionLevel;
    Scanner scan = new Scanner(System.in);


    public void setResolutionLevel() {
        int level = scan.nextInt();
        switch (level) {
            case 1:
                this.resolutionLevel = 1;
                System.out.println("Low - 2GB");
                break;
            case 2:
                this.resolutionLevel = 2;
                System.out.println("Medium - 4GB)");
                break;
            case 3:
                this.resolutionLevel = 3;
                System.out.println("High - 6GB");
                break;
            default:
                System.out.println("No available resolution level");
        }
    }

    public void takePicture(int resolutionLevel, String name){
        int
    }
    public int getResolutionLevel() {
        return this.resolutionLevel;
    }
    public void size(){

    }


}
