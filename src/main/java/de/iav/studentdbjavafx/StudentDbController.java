package de.iav.studentdbjavafx;

import de.iav.studentdbjavafx.model.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentDbController implements Initializable {

    @FXML
    private ComboBox<String> courseOfStudies;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField email;

    private void initialize_courseOfStudies() {
        courseOfStudies.getItems().add("Mechatronik");
        courseOfStudies.getItems().add("Elektrotechnik");
        courseOfStudies.getItems().add("BWL");
        courseOfStudies.getItems().add("Informatik");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        initialize_courseOfStudies();
    }

    @FXML
    protected void onRegisterButtonClick_CreateStudent() {
        System.out.println(new Student(
                firstName.getText(),
                lastName.getText(),
                email.getText(),
                courseOfStudies.getValue()
        ));
    }
    @FXML
    protected void onResetButtonClick_clearForm(){
        firstName.clear();
        lastName.clear();
        email.clear();
        courseOfStudies.setValue("");
    }
}