package HW_3_1;

/**
 * Created by IIOPIIIEHb on 11.03.2016.
 */
public class File {
    private String name;
    private Double size;
    private String password = "asamokysh";

    public String getName () {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public Double getSize() {
        return size;
    }

    public void setSize (Double size ) {this.size = size; }
}
