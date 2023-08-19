package lk.studio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {

    public TextField txtName;
    public PasswordField password ;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(LoginFormController.class.getResource("../view/AdminDashboardForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();

    }
}
