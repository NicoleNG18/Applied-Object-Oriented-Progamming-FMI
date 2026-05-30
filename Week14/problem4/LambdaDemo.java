package problem4;


import javafx.scene.control.Button;

public class LambdaDemo {
    static void main() {
        Button button = new Button();
        button.setOnAction(event -> System.out.println("Button clicked"));
    }
}
