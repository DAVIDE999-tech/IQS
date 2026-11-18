import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClosingResources {
    public static void main(String[] args) {
        File inputFile = new File("src/test.txt");
        File outputFile = new File("src/output.txt");
        try (Scanner in = new Scanner(inputFile); PrintWriter out = new PrintWriter(outputFile)) {
            while (in.hasNextLine()) {
                String result = processData(in.nextLine());
                out.println(result);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Il file specificato non esiste.");
        }
    }

    private static String processData(String line) {
        int value = Integer.parseInt(line);
        value = value + 100;
        return "" + value;
    }
}
