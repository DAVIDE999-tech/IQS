package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject(100);

        new DecimalObserver(subject);
        new BinaryObserver(subject);
        new HexadecimalObserver(subject);
        new OctalObserver(subject);

        System.out.println("Stampo gli stati che cambiano per 10 volte");
        for (int i = 1; i <= 10; i++) {
            subject.setState(100 + i);
        }
    }
}
