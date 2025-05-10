module faison.accordian {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens faison.accordian to javafx.fxml;
    exports faison.accordian;
}
