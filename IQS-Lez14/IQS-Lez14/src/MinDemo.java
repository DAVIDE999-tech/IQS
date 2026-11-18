import java.awt.*;

public class MinDemo {
    public static void main(String[] args) {
        String[] parole = {"viva", "la", "pappa", "col", "pomodoro"};
        Integer[] interi = {1, 2, -3, 4};
        Color[] colori = {Color.BLUE, Color.CYAN, Color.BLACK};
        System.out.println(min(parole));
        System.out.println(min(interi));
        //System.out.println(min(colori));
    }

    private static <E extends Comparable<E>> E min(E[] array) {
        E smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(smallest) < 0) {
                smallest = array[i];
            }
        }
        return smallest;
    }


}
