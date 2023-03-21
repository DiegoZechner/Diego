package at.dz.oo.Phone;

public class Phonefile {

    private String extension;
    private int size;
    private String name;



    public Phonefile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }


    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String Option() {
        return this.extension + " " + this.size + " ";
    }

}


