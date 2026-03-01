package shape;

public class RectangleTest {

    static void main() {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setWidth(15);

        System.out.printf("Rectangle { width: %.2f, height: %.2f, color: %s, area: %.2f, perimeter: %.2f } %n",
                rectangle.getWidth(), rectangle.getHeight(),
                Rectangle.getColor(), rectangle.getArea(), rectangle.getPerimeter());

    }
}
