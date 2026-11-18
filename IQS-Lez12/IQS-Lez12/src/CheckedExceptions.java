import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            String fileName = "src/test.txt";
            System.out.println("La somma dei valori è " + readData(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Il file specificato non esiste.");
        } catch (NumberFormatException e) {
            System.out.println("Il contenuto del file non è corretto");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("Raggiunta la fine del file.");
            e.printStackTrace();
        }
    }

    private static int readData(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileName));
        int sum = 0;
        while (in.hasNext()) {
            sum = sum + Integer.parseInt(in.next()); // in.next() NoSuchElementException
                                                     // parseInt() NumberFormatException
        }
        return sum;
    }
}
