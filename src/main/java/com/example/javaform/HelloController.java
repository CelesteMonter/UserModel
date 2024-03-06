package com.example.javaform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField name = new TextField();
    @FXML
    private TextField lastname = new TextField();
    @FXML
    private TextField username = new TextField();
    @FXML
    private TextField email = new TextField();
    @FXML
    private TextField cellphone = new TextField();
    @FXML
    private TextField password = new TextField();

    @FXML
    private TextArea textArea = new TextArea();

    @FXML
    protected void getUserModel() {

        UserModel user  = new UserModel(

                name.getText(),
                lastname.getText(),
                username.getText(),
                email.getText(),
                cellphone.getText(),
                password.getText()
        );

        textArea.setText("Nombre: " + user.name + "\nApellido: " + user.lastname + "\nNombre de Usuario:  " + user.username + "\nCorreo: " + user.email + "\nNumero de telefono  " + user.cellphone + "\nContrasena:  " + user.password);
    }

    @FXML
    protected void cleanForm() {

        name.setText("");
        lastname.setText("");
        username.setText("");
        email.setText("");
        cellphone.setText("");
        password.setText("");
        textArea.setText("");

    }
}