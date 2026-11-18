public class StackDemo {
    public static void main(String[] args) {
        // Instanziare tre stack di tipi differenti
        // Aggiungere elementi tramite push()
        // Stampare il contenuto tramite pop() e size()

        Stack<Integer> countdown = new Stack<>();
        for (int i = 0; i <= 10; i++) {
            countdown.push(i);
        }
        System.out.println("Uso uno stack di interi");
        print(countdown);

        Stack<String> parole = new Stack<>();
        System.out.println("Uso uno stack di stinghe");
        parole.push("pomodoro!");
        parole.push("col");
        parole.push("pappa");
        parole.push("la");
        parole.push("Viva");
        print(parole);
    }

    public static <E> void print(Stack<E> stack) {
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

}