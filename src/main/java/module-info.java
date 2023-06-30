module de.iav.studentdbjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.iav.studentdbjavafx to javafx.fxml;
    exports de.iav.studentdbjavafx;
}