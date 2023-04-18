package at.dz.oo.Camera;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(16);
        storage.addMemoryCard(32); // Erhöht den Speicherplatz um 32 GB

        Camera camera = new Camera(storage);

        camera.setResolutionLevel();
        camera.takePicture();

    }

}
