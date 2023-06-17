/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmanager;

/**
 *
 * @author HP
 */
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginPageView extends VBox {
    private TextField userName;
    private PasswordField password;
    private Button loginButton;

    public LoginPageView() {
        userName = new TextField("user");
        password = new PasswordField();
       
        loginButton = new Button("Login");

        this.getChildren().addAll(userName, password, loginButton);
    }

    public TextField getUserName() {
        return userName;
    }

    public PasswordField getPasswordField() {
        return password;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}