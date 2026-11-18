package Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer(); // TO DO: Utilizzare una factory tramite factory method
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart keyboard = new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }
}
