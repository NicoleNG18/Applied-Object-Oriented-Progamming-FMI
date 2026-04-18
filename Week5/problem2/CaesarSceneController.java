package problem2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CaesarSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDecrypt;

    @FXML
    private Button btnEncrypt;

    @FXML
    private TextField txtKey;

    @FXML
    private TextField txtPlainText;

    @FXML
    private TextField txtEncryptedText;

    @FXML
    void btnDecrypOnAction(ActionEvent event) {
        int encryptionKey = Integer.parseInt(txtKey.getText());
        String encryptedText = txtEncryptedText.getText();
        String plaintext =  CaesarCipher.decrypt(encryptionKey,encryptedText);
        txtPlainText.setText(plaintext);
    }

    @FXML
    void btnEncryptOnAction(ActionEvent event) {
        int encryptionKey = Integer.parseInt(txtKey.getText());
        String plaintext = txtPlainText.getText();
        String encryptedText =  CaesarCipher.encrypt(encryptionKey,plaintext);
        txtEncryptedText.setText(encryptedText);
    }

    @FXML
    void initialize() {
        assert btnDecrypt != null : "fx:id=\"btnDecrypt\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert btnEncrypt != null : "fx:id=\"btnEncrypt\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert txtKey != null : "fx:id=\"txtKey\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert txtPlainText != null : "fx:id=\"txtPlainText\" was not injected: check your FXML file 'CipherScene.fxml'.";
    }

}
