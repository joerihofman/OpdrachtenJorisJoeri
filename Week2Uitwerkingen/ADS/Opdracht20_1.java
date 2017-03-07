import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opdracht20_1{
    public static void main(String[] args) throws IOException {
        List<String> originalList = textToList("Week2Uitwerkingen/ADS/textfile.txt");
        List<String> sortedList = new ArrayList<>();

        for(int item=0; item < sortedList.size(); item++){
            System.out.println(item);
        }
    }

    public static List textToList(String pathToFile) throws IOException {
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