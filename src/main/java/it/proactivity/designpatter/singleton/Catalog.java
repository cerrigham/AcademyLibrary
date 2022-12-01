package it.proactivity.designpatter.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Catalog {

    public static Catalog instance;
    private static File file = new File("src/main/resources/libraryCatalog.txt");

    private Catalog() {
    }

    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }


    public void writeItemDetailsIntoLibraryCatalogFile(String itemDetails) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(itemDetails);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
