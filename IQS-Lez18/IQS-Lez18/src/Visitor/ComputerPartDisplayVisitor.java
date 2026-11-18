package Visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Sono un computer."); // Business logic da eseguire durante la visita del Glyph
        for (ComputerPart part : computer.getParts()) {
            // TO DO
        }
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Sono un mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Sono una tastiera");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Sono un monitor");
    }
}
