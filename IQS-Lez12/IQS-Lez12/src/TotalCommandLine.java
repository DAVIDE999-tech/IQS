import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Total -t in.txt out.txt -> aggiunge la linea di totale
 * Total in.txt out.txt -> non aggiunge la linea di totale
 * Total -t in.txt -> usage
 */
public class TotalCommandLine {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName = "";
        String outputFilename = "";
        boolean optionSpecified = false; // Vero se è specificato -t
        int files = 0; // Numero di file nella linea di comando

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.charAt(0) == '-') {
                optionSpecified = true;
                if (arg.charAt(1) != 't') {
                    usage();
                    return;
                }
            } else {
                files++;
                if (files == 1) {
                    inputFileName = arg;
                } else if (files == 2) {
                    outputFilename = arg;
                }
            }
        }
        if (files != 2) {
            usage();
            return;
        }

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
        if (optionSpecified) {
            out.printf("Totale: %7.2f", total);
        }

        in.close();
        out.close();
    }

    private static void usage() {
        System.out.println("Usage: Total [-t] inputFile outputFile");
    }

}
