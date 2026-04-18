package gcd;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGCD;

    @FXML
    private Button btnQuit;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtGCD;

    @FXML
    void btnGCDOnAction(ActionEvent event) {
        int aNum = Integer.parseInt(txtA.getText());
        int bNum = Integer.parseInt(txtB.getText());
        txtGCD.setText(computeGCD(aNum, bNum));
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void initialize() {
        assert btnGCD != null : "fx:id=\"btnGCD\" was not injected: check your FXML file 'view.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'view.fxml'.";
        assert txtA != null : "fx:id=\"txtA\" was not injected: check your FXML file 'view.fxml'.";
        assert txtB != null : "fx:id=\"txtB\" was not injected: check your FXML file 'view.fxml'.";
        assert txtGCD != null : "fx:id=\"txtGCD\" was not injected: check your FXML file 'view.fxml'.";

    }

    private String computeGCD(int first, int second) {

        if (first < second) {
            int help = first;
            first = second;
            second = help;
        }

        int gcd = computeGCDRec(first, second);

        return String.valueOf(gcd);
    }

    private int computeGCDRec(int first, int second) {
        if (second == 0) {
            return first;
        }

        return computeGCDRec(second, first % second);
    }

}
