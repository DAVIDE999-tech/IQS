import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        Measurable[] conti = new Conto[3];

        conti[0] = new Conto(1000.0);
        conti[1] = new Conto(500.0);
        conti[2] = new Conto(1500);

        System.out.println("Elenco dei saldi dei conti correnti così come creati:");
        for (int i = 0; i < conti.length; i++) {
            System.out.println(((Conto) conti[i]).getSaldo());
        }

        System.out.println("Elenco dei conti correnti ordinati in ordine crescente");
        Arrays.sort(conti); // Merge sort di Oracle
        for (int i = 0; i < conti.length; i++) {
            System.out.println(((Conto) conti[i]).getSaldo());
        }
    }
}
