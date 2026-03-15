package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField bccField;

    @FXML
    private TextArea bodyArea;

    @FXML
    private TextField ccField;

    @FXML
    private TextField subjectField;

    @FXML
    private TextField toField;

    @FXML
    void handleCancel(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void handleSend(ActionEvent event) {
        String to = toField.getText();
        String cc = ccField.getText();
        String bcc = bccField.getText();
        String subject = subjectField.getText();
        String body = bodyArea.getText();

        String content = String.format(
                "To: %s\n" +
                        "CC: %s\n" +
                        "Bcc: %s\n" +
                        "Subject: %s\n\n" +
                        "Message Body:\n%s",
                to, cc, bcc, subject, body
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Email Sent Successfully");
        alert.setHeaderText("Message Details:");
        alert.setContentText(content);

        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert bccField != null : "fx:id=\"bccField\" was not injected: check your FXML file 'Untitled'.";
        assert bodyArea != null : "fx:id=\"bodyArea\" was not injected: check your FXML file 'Untitled'.";
        assert ccField != null : "fx:id=\"ccField\" was not injected: check your FXML file 'Untitled'.";
        assert subjectField != null : "fx:id=\"subjectField\" was not injected: check your FXML file 'Untitled'.";
        assert toField != null : "fx:id=\"toField\" was not injected: check your FXML file 'Untitled'.";
    }

}
