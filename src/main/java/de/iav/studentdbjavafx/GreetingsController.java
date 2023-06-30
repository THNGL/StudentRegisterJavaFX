package de.iav.studentdbjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GreetingsController {
    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML
    private Button stepToRegister;


    @FXML
    protected void stepOverToFormular(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("studentDB.fxml"));
        root = loader.load();

        StudentDbController studentDbController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
}
