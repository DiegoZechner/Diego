package at.dz.oo.Camera;
import java.util.ArrayList;

public class Storage {
    private ArrayList<String> fileList;
    private int maxStorageSize;
    private int currentStorageSize;

    public Storage(int maxStorageSize){
        this.maxStorageSize = maxStorageSize;
        fileList = new ArrayList<String>();
        currentStorageSize = 0;
    }
    public void addFile(String fileName, int resolutionLevel) {
        int fileSize = 0;
        switch (resolutionLevel) {
            case 1:
                fileSize = 2;
                break;
            case 2:
                fileSize = 4;
                break;
            case 3:
                fileSize = 6;
                break;
        }
        if (currentStorageSize + fileSize <= maxStorageSize) {
            fileList.add(fileName);
            currentStorageSize += fileSize;
            System.out.println(fileName + " wurde erfolgreich hinzugefügt.");
        } else {
            System.out.println("Es ist nicht genügend Speicherplatz vorhanden.");
        }
    }
    public void addMemoryCard(int additionalMemory) {
        maxStorageSize += additionalMemory;
        System.out.println("Die Speicherkarte mit " + additionalMemory + " GB wurde hinzugefügt.");
    }


}
