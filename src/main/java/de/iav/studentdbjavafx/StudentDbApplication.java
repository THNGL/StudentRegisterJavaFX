package de.iav.studentdbjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDbApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StudentDbApplication.class.getResource("/de/iav/studentdbjavafx/studentDB.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Student Database!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}