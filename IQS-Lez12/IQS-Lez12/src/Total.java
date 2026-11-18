import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Inserire il nome del file di input: ");
        String inputFileName = console.next();
        System.out.print("Inserire il nome del file di output: ");
        String outputFilename = console.next();

        String path = "src/";
        File inputFile = new File(path + inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(path + outputFilename);

        //To do: Business logic
        double total = 0.0;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            total = total + value;
            out.printf("%15.2f\n", value);
        }
        out.printf("Totale: %7.2f", total);

        in.close();
        out.close();
    }

}
