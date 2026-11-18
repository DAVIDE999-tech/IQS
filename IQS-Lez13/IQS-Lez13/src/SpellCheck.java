import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SpellCheck {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> dictionary = readWords("src/parole.txt");
        Set<String> document = readWords("src/san_martino.txt");
        for (String word : document) {
            if (!dictionary.contains(word)) {
                System.out.println(word);
            }
        }
    }

    private static Set<String> readWords(String fileName) throws FileNotFoundException {
        Set<String> words = new TreeSet<>();
        Scanner in = new Scanner(new File(fileName));

        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}
