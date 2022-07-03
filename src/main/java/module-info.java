module org.rexsong.demo.javafx_demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.rexsong.demo.javafx_demo to javafx.fxml;
    exports org.rexsong.demo.javafx_demo;
}