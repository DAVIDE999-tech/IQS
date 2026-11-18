import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> amici = new LinkedList<>();
        amici.add("Marco");
        amici.add("Anna");
        amici.add("Luigi");
        amici.add("Francesca");
        for (String amico : amici) {
            System.out.println(amico);
        }
        ListIterator<String> iterator = amici.listIterator();
        iterator.next();
        iterator.next();
        iterator.previous();
        iterator.add("Antonio");
        iterator.next();
        iterator.remove();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String amico : amici) {
            System.out.println(amico);
        }
    }
}
