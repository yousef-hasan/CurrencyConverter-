/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmanager;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewManager extends Application {
    private Stage primaryStage;
    private LoginPageView loginPageView;
    private SystemPageView systemPageView;
    private CurrencyConverter currencyConverter;
    
    public ViewManager() {
        currencyConverter = new CurrencyConverter();
    }

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showLoginPage();
    }

    public void showLoginPage() {
        loginPageView = new LoginPageView();

        loginPageView.getLoginButton().setOnAction(event -> {
            String username = loginPageView.getUserName().getText();
            String password = loginPageView.getPasswordField().getText();

            if (username.equals("user") && password.equals("userpass")) {
                showSystemPage();
            } else {
                loginPageView.showAlert("Invalid credentials");
            }
        });

        Scene scene = new Scene(loginPageView, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showSystemPage() {
        systemPageView = new SystemPageView();

        systemPageView.getConvertButton().setOnAction(event -> {
            String dollarsText = systemPageView.getDollarsField().getText();
            String shekelsText = systemPageView.getShekelsField().getText();

            if (!dollarsText.isEmpty() && shekelsText.isEmpty()) {
                double dollars = Double.parseDouble(dollarsText);
                double shekels = currencyConverter.convertCurrency(dollars, true);
                systemPageView.getShekelsField().setText(Double.toString(shekels));
            } else if (dollarsText.isEmpty() && !shekelsText.isEmpty()) {
                double shekels = Double.parseDouble(shekelsText);
                double dollars = currencyConverter.convertCurrency(shekels, false);
                systemPageView.getDollarsField().setText(Double.toString(dollars));
            }
        });

        systemPageView.getLogoutButton().setOnAction(event -> {
            showLoginPage();
        });

        Scene scene = new Scene(systemPageView, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}