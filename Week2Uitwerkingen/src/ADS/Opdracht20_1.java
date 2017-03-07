package ADS;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opdracht20_1{
    public static void main(String[] args){
        List<String> originalList = textToList("textfile.txt");
        List<String> sortedList = new ArrayList<>();

        for(int item=0; item < sortedList.size(); item++){
            System.out.println(item)
        }
    }

    public ArrayList textToList(pathToFile){
        Path filePath = Paths.get(pathToFile);
        Scanner scanner = new Scanner(filePath);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                words.add(scanner.next());
            } else {
                scanner.next();
            }
        }

        return words;
    }
}