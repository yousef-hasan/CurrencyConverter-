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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SystemPageView extends VBox {
    private TextField dollarsField;
    private TextField shekelsField;
    private Button convertButton;
    private Button logoutButton;

    public SystemPageView() {
        dollarsField = new TextField();
        shekelsField = new TextField();
        convertButton = new Button("Convert");
        logoutButton = new Button("Log out");

        this.getChildren().addAll(dollarsField, shekelsField, convertButton, logoutButton);
    }

    public TextField getDollarsField() {
        return dollarsField;
    }

    public TextField getShekelsField() {
        return shekelsField;
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }
}
