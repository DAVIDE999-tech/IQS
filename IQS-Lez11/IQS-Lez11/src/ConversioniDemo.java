public class ConversioniDemo {
    public static void main(String[] args) {
        Measurable italia = new Stato("Italia", 302069.0);
        Measurable francia = new Stato("Francia", 675417.0);
        Measurable oggettoPiuGrande = larger(italia, francia);
        System.out.println("Lo stato più grande tra Italia e Francia è " + oggettoPiuGrande);

        Stato statoPiuGrande = (Stato) oggettoPiuGrande;
        System.out.println("Lo stato più grande: " + statoPiuGrande);
    }

    private static Measurable larger(Measurable oggetto1, Measurable oggetto2) {
        if (oggetto1.getMeasure() < oggetto2.getMeasure()) {
            return oggetto2;
        }
        return oggetto1;
    }
}
