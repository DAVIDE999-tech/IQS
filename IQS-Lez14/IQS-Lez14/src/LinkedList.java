import java.util.NoSuchElementException;

/**
 * Questa classe fornisce un'implementazione di una lista
*/
public class LinkedList {
   private Node first;
   
   /**
    * Costruisce una lista vuota
   */
   public LinkedList()
   {  
      first = null;
   }
   
   /**
    * Ritorna il primo elemento della lista
    * @return il primo elemento della lista
   */
   public Object getFirst() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      return first.data;
   }

   /**
    * Rimuove il primo elemento dalla lista
    * @return l'elemento rimosso
   */
   public Object removeFirst() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      Object element = first.data;
      first = first.next;
      return element;
   }

   /**
    * Aggiunge un elemento all'inizio della lista.
    * @param element l'elemeto da aggiungere
   */
   public void addFirst(Object element) {
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }
   
   /**
    * Costruisce un iteratore per scorrere la lista
    * @return un iteratore per scorrere la listra
   */
   public ListIterator listIterator() {
      return new LinkedListIterator();
   }
   
   class Node {
      public Object data;
      public Node next;
   }

   class LinkedListIterator implements ListIterator {
      private Node position;
      private Node previous;
      private boolean isAfterNext;

      /**
       * Costruisce un iteratore che punta all'inizio della lista
      */
      public LinkedListIterator() {
         position = null;
         previous = null;
         isAfterNext = false;
      }
      
      /**
       *  Muove l'iteratore avanti di una posizione.
       * @return l'elemento attravarsato
      */
      public Object next() {
         if (!hasNext()) {
            throw new NoSuchElementException();
         }
         previous = position; // Remember for remove
         isAfterNext = true;

         if (position == null) {
            position = first;
         } else {
            position = position.next;
         }
         return position.data;
      }
      
      /**
       * Verifica se esiste un elemento successivo
       * @return true se esiste un elemento successivo
      */
      public boolean hasNext() {
         if (position == null) {
            return first != null;
         } else {
            return position.next != null;
         }
      }
      
      /**
       * Aggiunge un elemento alla lista prima dell'iteratore e lo sposta in avanti di una posizione
       * @param element l'elemento da aggiungere
      */
      public void add(Object element) {
         if (position == null) {
            addFirst(element);
            position = first;
         } else {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;
         }
         isAfterNext = false;
      }
      
      /**
       * Rimuove l'ultimo elemento attraversato
       * Può essere chiamato solo dopo aver invocato un next().
      */
      public void remove() {
         if (!isAfterNext) {
            throw new IllegalStateException();
         }
         if (position == first) {
            removeFirst();
         } else {
            previous.next = position.next;
         }
         position = previous;
         isAfterNext = false;
      }

      /**
         Modifica il valore dell'ukltimo elemento attraversato
         @param element il nuovo valore dell'elemento
      */
      public void set(Object element) {
         if (!isAfterNext) {
            throw new IllegalStateException();
         }
         position.data = element;
      }
   }
}