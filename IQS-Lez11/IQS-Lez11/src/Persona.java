public class Persona implements Measurable{
    private String nome;
    private double altezza;

    public Persona(String nome, double altezza) {
        this.nome = nome;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", altezza=" + altezza +
                '}';
    }

    @Override
    public double getMeasure() {
        return altezza;
    }
}
