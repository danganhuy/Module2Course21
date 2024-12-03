package Shape;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            default:
                return null;
        }
    }
}
