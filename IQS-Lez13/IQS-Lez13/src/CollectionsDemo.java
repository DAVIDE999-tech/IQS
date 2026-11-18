import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        System.out.println("Creo collezione tramite ArrayList");
        workWith(new ArrayList<>());
        System.out.println("Creo collezione tramite TreeSet");
        workWith(new TreeSet<>());
    }

    private static void workWith(Collection<String> coll) {
        coll.add("Luca");
        coll.add("Marta");
        coll.add("Francesco");
        coll.add("Antonella");
        System.out.println(coll);
        System.out.println("------ Fine collezione ------");
        System.out.println(coll.remove("Stefano"));
        System.out.println(coll);
        System.out.println("------ Fine collezione ------");
        System.out.println("La collezione contiene Luca? " + coll.contains("Luca"));
    }
}
