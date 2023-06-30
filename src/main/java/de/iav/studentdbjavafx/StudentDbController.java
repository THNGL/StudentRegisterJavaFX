package de.iav.studentdbjavafx;

import de.iav.studentdbjavafx.model.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentDbController implements Initializable {

    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private ComboBox<String> courseOfStudies;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField email;

    @FXML
    private CheckBox privacyCheckBox;

    @FXML
    private Button registerButton;

    private void initialize_courseOfStudies() {
        courseOfStudies.getItems().add("Mechatronik");
        courseOfStudies.getItems().add("Elektrotechnik");
        courseOfStudies.getItems().add("BWL");
        courseOfStudies.getItems().add("Informatik");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        initialize_courseOfStudies();
        registerButton.setDisable(true);
    }

    @FXML
    public void onRegisterButtonClick_CreateStudent(ActionEvent event) throws IOException {
        Student studentToPrint = new Student(
                firstName.getText(),
                lastName.getText(),
                email.getText(),
                courseOfStudies.getValue()
        );
        FXMLLoader loader = new FXMLLoader(getClass().getResource("studentPrinter.fxml"));
        root = loader.load();

        //StudentPrinterController studentPrinterController = loader.getController();
        //studentPrinterController.setStudentPrinter(studentToPrint);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();

    }
    @FXML
    protected void onResetButtonClick_clearForm(){
        firstName.clear();
        lastName.clear();
        email.clear();
        courseOfStudies.setValue("");
    }

    @FXML
    protected void isPrivacyChecked(ActionEvent event){
        System.out.println("Datenschutzerklärung geöffnet");
        registerButton.setDisable(!privacyCheckBox.isSelected());
    }
    @FXML
    protected void onBackToOpenerButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();

        GreetingsController greetingsController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }


}