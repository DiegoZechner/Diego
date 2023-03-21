package at.dz.oo.Phone;

public class Camera {
    private int resolution;
    private int pictureNumber = 1;

    public Camera(int resolution) {
        this.resolution = resolution;

    }


    public Phonefile makePicture() {
        System.out.println("Taking picture");
        Phonefile file = new Phonefile("jpg", 1000, "picture" + pictureNumber);
        pictureNumber++;
        return file;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }


    public int getResolution() {
        return resolution;
    }

}

