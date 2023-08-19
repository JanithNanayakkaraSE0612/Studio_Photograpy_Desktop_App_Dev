package lk.studio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardFormController {
    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/CustomerForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/SupplierForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void btnOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void btnReportOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }


    public void ClickedOnHomePage(MouseEvent mouseEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }

    public void onClickLogout(MouseEvent mouseEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.
                load(AdminDashboardFormController.class.getResource("../view/EmployeeForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}
