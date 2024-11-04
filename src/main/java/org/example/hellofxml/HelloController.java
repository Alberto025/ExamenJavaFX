package org.example.hellofxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private static final String USER = "Francisco";
    private static final String PASSWORD = "123456";

    @FXML
    private CheckBox cbSesion;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label info;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    @FXML
    public void cancel(ActionEvent actionEvent) {
        System.exit(0);
    }


}