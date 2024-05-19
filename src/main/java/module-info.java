module org.example.randomrpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.randomrpg to javafx.fxml;
    exports org.example.randomrpg;
}