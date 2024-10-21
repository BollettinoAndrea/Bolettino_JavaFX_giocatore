module com.example.bolettino_javafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bolettino_javafx2 to javafx.fxml;
    exports com.example.bolettino_javafx2;
}