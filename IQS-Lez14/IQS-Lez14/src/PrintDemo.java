import java.awt.*;

public class PrintDemo {
    public static void main(String[] args) {
        String[] parole = {"Viva", "la", "pappa", "col", "pomodoro"};
        int[] interi = {1, 2, 3, 4};
        Color[] colori = {Color.BLUE, Color.CYAN, Color.BLACK};
        print(parole);
        print(interi);
        print(colori);
    }

    private static <E> void print(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }

    private static void print(int[] array) { // Inutilmenre e pericolosamente duplicato
        for (int i : array) {
            System.out.println(i);
        }
    }
}
