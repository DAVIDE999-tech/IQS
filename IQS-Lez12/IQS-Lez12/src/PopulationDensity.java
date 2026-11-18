import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopulationDensity {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("src/" + "popolazione.txt"));
        Scanner in2 = new Scanner(new File("src/" + "superficie.txt"));
        PrintWriter out = new PrintWriter("src/" + "densita.txt");

        while (in1.hasNextLine() && in2.hasNextLine()) {
            RegionValue population = new RegionValue(in1.nextLine());
            RegionValue area = new RegionValue(in2.nextLine());
            double density = 0.0;
            if (area.getValue() != 0) {
                density = population.getValue() / area.getValue();
            }
            out.printf("%-40s%15.2f\n", population.getRegion(), density);
        }

        in1.close();
        in2.close();
        out.close();
    }
}
