package shape;

public class Rectangle {

    private double width;
    private double height;
    private static String color = "yellow";

    //default values: double -> 0, String -> null
    Rectangle() {
        this.width = 1;
        this.height = 2;
    }

    Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public static String getColor() {
        return color;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 2;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public static void setColor(String color) {
        Rectangle.color = color != null ? color : "yellow";
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }


}
