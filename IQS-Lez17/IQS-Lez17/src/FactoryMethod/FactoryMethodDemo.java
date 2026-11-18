package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory(); // Utilizzo il look and feel disponibile
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("CIRCLE");
        shape3.draw();
    }
}
