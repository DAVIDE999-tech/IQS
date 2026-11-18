public class MeasurableDemo {
    public static void main(String[] args) {
        Measurable[] conti = new Measurable[3];
        Measurable[] stati = new Measurable[3];

        conti[0] = new Conto(1000.0);
        conti[1] = new Conto(500.0);
        conti[2] = new Conto(1500);

        stati[0] = new Stato("Italia", 302069.0);
        stati[1] = new Stato("Francia", 675417.0);
        stati[2] = new Stato("Svizzera", 41291.0);

        System.out.println("La media dei conti è: " + Algoritmo.media(conti));
        System.out.println("La media degli stati è: " + Algoritmo.media(stati));
    }
}
