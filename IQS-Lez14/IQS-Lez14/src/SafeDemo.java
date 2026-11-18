import java.util.LinkedList;
import java.util.ListIterator;

public class SafeDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        print(numbers);
        numbers.addFirst(4); // Deve essere segnalato staticamente un errore
        print(numbers);
        System.out.println("Somma degli elementi nella lista: " + sum(numbers));
    }

    private static int sum(LinkedList<Integer> numbers) {
        ListIterator<Integer> iterator = numbers.listIterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum = sum + iterator.next();
        }
        return sum;
    }

    private static void print(LinkedList<Integer> numbers) {
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
