import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Opdracht20_1{
    public static void main(String[] args) throws IOException {
        List<String> originalList = textToList("Week2Uitwerkingen/ADS/textfile.txt");
        Collections.sort(originalList);
        Collections.reverse(originalList);
    }

    public static List textToList(String pathToFile) throws IOException {
        //inspiratie: http://stackoverflow.com/questions/3806062/how-to-open-a-txt-file-and-read-numbers-in-java
        Path filePath = Paths.get(pathToFile);
        Scanner scanner = new Scanner(filePath);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.matches(".*\\d+.*")) {
                ;
            }
            else {
                words.add(word);
            }
        }

        return words;
    }
}