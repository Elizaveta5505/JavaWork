package JavaWork.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exportContact {
    static ArrayList<String> expContactRows(String path) throws FileNotFoundException {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            ArrayList<String> arr = new ArrayList<>(3);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\ ");
                if (words[0].isBlank() == false){
                    for (String a : words) {
                        arr.add(a);
                    }
                }
            }
            scanner.close();
            return arr;
        }
}
