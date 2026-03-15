package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnShowTable;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextArea txtAreaResults;

    @FXML
    private TextField txtYears;

    @FXML
    void handleShowTable(ActionEvent event) {
        double amount = Double.parseDouble(txtAmount.getText());
        int years = Integer.parseInt(txtYears.getText());

        txtAreaResults.setText("Interest Rate    Monthly Payment    Total Payment\n\n");

        for (double rate = 5.0; rate <= 8.0; rate += 0.125) {

            LoanComponent loan = new LoanComponent(rate, years, amount);

            double monthly = loan.getMonthlyPayment();
            double total = loan.getTotalPayment();

            String row = String.format("%-17.3f %-18.2f %-18.2f%n", rate, monthly, total);

            txtAreaResults.appendText(row);
        }
    }

    @FXML
    void initialize() {
        assert btnShowTable != null : "fx:id=\"btnShowTable\" was not injected: check your FXML file 'view.fxml'.";
        assert txtAmount != null : "fx:id=\"txtAmount\" was not injected: check your FXML file 'view.fxml'.";
        assert txtAreaResults != null : "fx:id=\"txtAreaResults\" was not injected: check your FXML file 'view.fxml'.";
        assert txtYears != null : "fx:id=\"txtYears\" was not injected: check your FXML file 'view.fxml'.";
    }

}
