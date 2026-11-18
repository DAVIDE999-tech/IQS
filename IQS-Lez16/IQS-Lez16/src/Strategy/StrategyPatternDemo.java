package Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd()); // Definisce l'algortimo da usare
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); // Indipendente dall'operazione

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationDivide());
        try {
            System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
        } catch (ArithmeticException e) {
            System.out.println("Operazione non consentita");
        }
    }
}
