import java.util.Arrays;

/**
 * Questa classe fornisce uno stack generico
 * @param <E> Il tipo degli elementi dello stack
 */
public class Stack<E> {
   //private E[] elements; // Questa implementazione non funziona poiché non è consentito fare new E[]
   private Object[] elements; // Usare questa implementazione in alternativa alla precedente
   private int currentSize;
   
   private static final int INITIAL_SIZE = 10;

   public Stack() {
    //elements = new E[INITIAL_SIZE] // Errore: non si può creare un array generico
    elements = new Object[INITIAL_SIZE]; // Usare questa implementazione in alternativa alla precedente
   }

   public void push(E value) {
      if (currentSize >= elements.length) {
         elements = Arrays.copyOf(elements, 2 * elements.length);
      }
      elements[currentSize] = value;
      currentSize++;
   }

   public E pop() {
      currentSize--;
      return (E) elements[currentSize]; // Questo cast provoca un "unchecked" warning
   }
   
   public int size() {
      return currentSize;
   }
}