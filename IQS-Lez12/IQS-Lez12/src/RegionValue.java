public class RegionValue {
    private String region;
    private double value;

    public RegionValue(String line) {
        int i = 0; // Indica l'inizio del valore numerico
        while (!Character.isDigit(line.charAt(i))) {
            i++;
        }
        int j = i - 1;
        while (Character.isWhitespace(line.charAt(j))) {
            j--;
        }
        this.region = line.substring(0, j + 1);
        this.value = Double.parseDouble(line.substring(i).trim());
    }

    public String getRegion() {
        return region;
    }

    public double getValue() {
        return value;
    }
}
