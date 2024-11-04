module org.example.hellofxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens org.example.hellofxml to javafx.fxml;
    exports org.example.hellofxml;
}