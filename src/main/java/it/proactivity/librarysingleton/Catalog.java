package it.proactivity.librarysingleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Catalog {

    public static Catalog istance;
    private File file = new File("src/main/resources/libraryCatalog.txt");
    private Catalog() {}

    public static Catalog getIstance() {
        if(istance == null) {
           istance = new Catalog();
        }
        return istance;
    }

    private File createFile() {
        try {
            if(file.createNewFile()) {
                System.out.println("File created");
            }
            return file;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public File writeFile(Object obj) {

        try {
            FileWriter fw = new FileWriter(file);

            if (!file.exists()) {
                createFile();
                fw.write(obj.toString() + "\n");

            }else {
                fw.write(obj.toString() + "\n");

            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
