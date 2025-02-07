package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashFormController {

    @  FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/add-customer-form.fxml  "))));
       stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
         }


    }

    @FXML
    void btnViewCustomerOnAction(ActionEvent event) {

        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/view_customer_form.fxml  "))));
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
