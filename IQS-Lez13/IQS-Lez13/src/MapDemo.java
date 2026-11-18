import java.awt.*;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Color> coloriPreferiti = new TreeMap<>();
        coloriPreferiti.put("Luca", Color.YELLOW);
        coloriPreferiti.put("Marta", Color.GREEN);
        coloriPreferiti.put("Antonella", Color.YELLOW);
        coloriPreferiti.put("Antonella", Color.BLACK);
        coloriPreferiti.put("Saverio", Color.BLUE);
        System.out.println(coloriPreferiti);
        System.out.println("---- Stampo con un ciclo for esteso ----");
        Set<String> keySet = coloriPreferiti.keySet();
        for (String key : keySet) {
            System.out.println(key + " -> " + coloriPreferiti.get(key));
        }

        System.out.println("---- Stampo con un iteratore ----");
        Iterator<Map.Entry<String, Color>> iterator = coloriPreferiti.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Color> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
