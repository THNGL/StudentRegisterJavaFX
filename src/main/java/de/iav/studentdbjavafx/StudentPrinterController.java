package de.iav.studentdbjavafx;

import de.iav.studentdbjavafx.model.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentPrinterController {

    private Parent root;
    private Stage stage;

    private Scene scene;

    @FXML
    private TextArea studentPrinter;

    public void setStudentPrinter(Student student){
        this.studentPrinter.setText(student.toString());
    }

    @FXML
    protected void switchBackToWelcomePage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();

        GreetingsController greetingsController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    protected void switchBackToRegistrationPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("studentDB.fxml"));
        root = loader.load();

        StudentDbController studentDbController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

}
