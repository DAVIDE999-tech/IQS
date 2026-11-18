package Decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape; // Al posto dell'ereditarità uso la composizione

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
