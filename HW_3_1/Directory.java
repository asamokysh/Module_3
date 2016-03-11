package HW_3_1;

import java.util.List;

/**
 * Created by IIOPIIIEHb on 11.03.2016.
 */
public class Directory {
    List<File> files;

    public File file;


  void createFile() {this.file = new File(); }

    void setFileName(String name) {file.setName(name); }
    String getFilename() {return file.getName(); }
}
