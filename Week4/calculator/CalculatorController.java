package calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController {

    private final CalculatorComponent calculatorComponent = new CalculatorComponent();
    private String operator = "";
    private boolean start = true;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtDisplay;

    @FXML
    void txtOnAction(ActionEvent event) {
        btnHandleEqual(event);
    }

    @FXML
    void btnHandleDigit(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();

        if (start) {
            txtDisplay.setText(digit);
            start = false;
        } else {
            if (digit.equals(".") && txtDisplay.getText().endsWith(".")) return;
            txtDisplay.appendText(digit);
        }
    }

    @FXML
    void btnHandleOperation(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        String currentText = txtDisplay.getText();

        if (currentText.isEmpty() || currentText.equals("Error")) return;

        if (!operator.isEmpty() && currentText.endsWith(" ")) {
            txtDisplay.setText(currentText.substring(0, currentText.length() - 3) + " " + value + " ");
        } else {
            txtDisplay.appendText(" " + value + " ");
        }

        operator = value;
        start = false;
    }

    @FXML
    private void btnHandleEqual(ActionEvent event) {
        String text = txtDisplay.getText().trim();

        if (!text.contains(" ")) {
            // adds spaces around operators (+, -, *, /) to ensure correct splitting of the expression
            text = text.replaceAll("([+\\-*/])", " $1 ");
        }

        // split the text: "5", "+", "4"
        String[] parts = text.split("\\s+");

        if (parts.length < 3) return;

        calculatorComponent.setFirstInput(Double.parseDouble(parts[0]));
        String op = parts[1];
        calculatorComponent.setSecondInput(Double.parseDouble(parts[2]));

        switch (op) {
            case "+" -> calculatorComponent.add();
            case "-" -> calculatorComponent.subtract();
            case "*" -> calculatorComponent.multiply();
            case "/" -> calculatorComponent.divide();
        }

        double res = calculatorComponent.getCalculatorResult();

        if (Double.isNaN(res)) {
            txtDisplay.setText("Error");
        } else {
            // remove .0 if the result is a whole number for a cleaner display
            if (res == (long) res) {
                txtDisplay.setText(String.valueOf((long) res));
            } else {
                txtDisplay.setText(String.valueOf(res));
            }
        }

        start = true;
        operator = "";
    }

    @FXML
    void btnHandleClear(ActionEvent event) {
        txtDisplay.setText("0");
        start = true;
    }

    @FXML
    void btnHandleAllClear(ActionEvent event) {
        txtDisplay.setText("0");
        operator = "";
        start = true;

        calculatorComponent.setFirstInput(0);
        calculatorComponent.setSecondInput(0);
        calculatorComponent.memoryClear();
    }

    @FXML
    void btnHandleOff(ActionEvent event) {
        Platform.exit();
    }
}