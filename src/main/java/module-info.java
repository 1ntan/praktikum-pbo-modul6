module com.example.praktikumpbomodul6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.praktikumpbomodul6 to javafx.fxml;
    exports com.example.praktikumpbomodul6;

    opens com.codelab to javafx.fxml;
    exports com.codelab;

    opens com.tugas.gui to javafx.fxml;
    exports com.tugas.gui;
    exports com.tugas.gui.admin;
    opens com.tugas.gui.admin to javafx.fxml;
    exports com.tugas.gui.student;
    opens com.tugas.gui.student to javafx.fxml;
}