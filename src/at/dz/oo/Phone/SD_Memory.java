package at.dz.oo.Phone;
import java.util.ArrayList;
import java.util.List;

public class SD_Memory<Phonefile> {
    private int capacity;
    private List<Phonefile> files;

    public SD_Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


    public void save(Phonefile file) {
        files.add(file);
    }


    public List<Phonefile> getFiles() {
        return files;
    }

}
