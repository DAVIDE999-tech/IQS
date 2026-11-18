public class Conto implements Measurable, Comparable {
    private double saldo;

    public Conto(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double importo) {
        saldo = saldo + importo;
    }

    public void preleva(double importo) {
        saldo = saldo - importo;
    }

    /*public double media(Conto[] conti) {
        double somma = 0;
        for (int i = 0; i < conti.length; i++) {
            somma = somma + conti[i].getSaldo();
        }
        if (conti.length != 0) {
            return somma / conti.length;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "Conto{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public double getMeasure() {
        return saldo;
    }

    @Override
    public int compareTo(Object o) {
        Conto altroConto = (Conto) o;
        if (saldo < altroConto.saldo) { //a.compareTo(b) a= saldo b=altroConto.saldo
            return -1;
        }
        if (saldo == altroConto.saldo) {
            return 0;
        }
        return 1;
    }
}
