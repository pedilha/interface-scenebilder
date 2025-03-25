module org.example.interdacescenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.interdacescenebuilder to javafx.fxml;
    exports org.example.interdacescenebuilder;
}