import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Opdracht20_1{
    public static void main(String[] args) throws IOException {
        List<String> originalList = textToList("Week2Uitwerkingen/ADS/textfile.txt");
        Collections.reverse(originalList);

        for(int i=0; i< originalList.size(); i++){
            System.out.println(originalList.get(i));
        }
    }

    public static List textToList(String pathToFile) throws IOException {
        Path filePath = Paths.get(pathToFile);
        Scanner scanner = new Scanner(filePath);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        return words;
    }
}