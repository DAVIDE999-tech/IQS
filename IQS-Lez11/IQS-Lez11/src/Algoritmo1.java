public class Algoritmo1 {
    public static double media(Object[] oggetti, Measurer measurer) {
            double somma = 0;
            for (int i = 0; i < oggetti.length; i++) {
                somma = somma + measurer.measure(oggetti[i]); //Callback o passaggio di funzione
            }
            if (oggetti.length != 0) {
                return somma / oggetti.length;
            }
            return 0;
    }
}
