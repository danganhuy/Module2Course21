import Shape.*;

public class Exercise4 {
    // [Bài tập] Áp dụng Factory Method
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
