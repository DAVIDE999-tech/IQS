package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false); // Definisco il look and feel
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        shapeFactory = FactoryProducer.getFactory(true); // Cambio look and feel
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("SQUARE");
        shape4.draw();

    }
}
