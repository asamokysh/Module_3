package HW_3_1;

/**
 * Created by IIOPIIIEHb on 11.03.2016.
 */
public class Main1 {

    public static void main(String[] args ) {

        Directory directory = new Directory();
        directory.createFile();
        directory.setFileName("txt_1");
        System.out.println(directory.getFilename() );
    }

}
