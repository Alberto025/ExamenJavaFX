package org.example.hellofxml;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import javafx.util.StringConverter;
import org.example.hellofxml.models.User;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable
{
    @javafx.fxml.FXML
    private ChoiceBox<User> choice;
    @javafx.fxml.FXML
    private Button btn;
    @javafx.fxml.FXML
    private ListView<User> lista;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //choice.getItems().add("Hola");
        //choice.getItems().add("Adios");
        //choice.setValue(choice.getItems().get(0));


        choice.getItems().add( new User(1L,"Francisco","Romero"));
        choice.getItems().add( new User(2L,"Alexandria","Romero"));

        choice.setConverter(new StringConverter<User>() {
            @Override
            public String toString(User user) {
                if(user!=null) return user.getFirstName();
                else return "";
            }

            @Override
            public User fromString(String s) {
                return null;
            }
        });

        lista.getItems().add( new User(1L,"Francisco","Romero"));
        lista.getItems().add( new User(2L,"Alexandre","Romero"));
        lista.getItems().add( new User(3L,"Julian","Romero"));
        lista.getItems().add( new User(4L,"David","Romero"));



    }



    @javafx.fxml.FXML
    public void volver(ActionEvent actionEvent) {
        HelloApplication.loadFXML("hello-view.fxml","Login");
    }

    @javafx.fxml.FXML
    public void accion(ActionEvent actionEvent) {
        lista.getItems().add( choice.getValue() );
    }
}