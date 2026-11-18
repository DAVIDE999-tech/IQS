public class Stato implements Measurable {
    private String nome;
    private double superficie;

    public Stato(String nome, double superficie) {
        this.nome = nome;
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public double getSuperficie() {
        return superficie;
    }

    /*public double media(Stato[] stati) {
        double somma = 0;
        for (int i = 0; i < stati.length; i++) {
            somma = somma + stati[i].getSuperficie();
        }
        if (stati.length != 0) {
            return somma / stati.length;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "Stato{" +
                "nome='" + nome + '\'' +
                ", superficie=" + superficie +
                '}';
    }

    @Override
    public double getMeasure() {
        return superficie;
    }
}
