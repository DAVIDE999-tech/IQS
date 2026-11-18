import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> interi = new Stack<>();
        interi.push(0);
        interi.push(1);
        interi.push(2);
        interi.push(3);
        interi.push(4);
        interi.push(5);
        System.out.println(interi);
        int dimensione = interi.size();
        for (int i = 0; i < dimensione; i++) {
            if (interi.peek() == 5) {
                System.out.println(interi.pop());
            }
        }
        System.out.println(interi);
    }
}
