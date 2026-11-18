public class Algoritmo {
    public static double media(Measurable[] oggetti) {
            double somma = 0;
            for (int i = 0; i < oggetti.length; i++) {
                somma = somma + oggetti[i].getMeasure();
            }
            if (oggetti.length != 0) {
                return somma / oggetti.length;
            }
            return 0;
    }
}
