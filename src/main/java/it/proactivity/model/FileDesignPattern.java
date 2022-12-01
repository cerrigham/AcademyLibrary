package it.proactivity.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDesignPattern {
    public static FileDesignPattern instance;

    private FileDesignPattern() {}

    public static FileDesignPattern getInstance() {
        if(instance == null) {
            instance = new FileDesignPattern();
        }
        return instance;
    }

    public static String readFile() throws FileNotFoundException {
        File myFile = new File("C:\\Users\\Veronica\\Documents\\libraryCatalog.txt");
        Scanner scanner = new Scanner(myFile);
        String s = scanner.nextLine();
        return s;
    }

    public static File writeFile(File myFile) throws IOException {
        String nuovoItem = "";
        if (!myFile.exists()) {
            return null;
        }
        if (myFile.exists()) {
            FileWriter fw = new FileWriter(myFile, true);
            fw.write(nuovoItem);
        }
        return myFile;
    }
}
