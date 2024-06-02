package com.tugas.gui;

import com.tugas.data.Admin;
import com.tugas.gui.admin.HalamanLoginAdmin;
import com.tugas.gui.student.HalamanLoginStudent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HalamanAwal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // stage utama
        primaryStage.setTitle("Form Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // judul
        Text scenetitle = new Text("Library System");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hbSceneTitle = new HBox(10);
        hbSceneTitle.setAlignment(Pos.CENTER);
        hbSceneTitle.getChildren().add(scenetitle);
        grid.add(hbSceneTitle, 2, 0);

        Text textLoginStudent = new Text("1. Login as Student");
        grid.add(textLoginStudent, 2, 1);

        Text textLoginAdmin = new Text("2. Login as Admin");
        grid.add(textLoginAdmin, 2, 2);

        Text textExit = new Text("3. Exit");
        grid.add(textExit, 2, 3);

        Text textMasukkanPilihan = new Text("Masukkan Pilihan:");
        grid.add(textMasukkanPilihan, 2, 4);

        TextField textFieldPilihan = new TextField();
        textFieldPilihan.setPromptText("Angka 1 - 3");
        grid.add(textFieldPilihan, 2, 5);

        Button btnPilih = new Button("Pilih");
        HBox hbBtnPilih = new HBox(10);
        hbBtnPilih.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnPilih.getChildren().add(btnPilih);
        grid.add(hbBtnPilih, 2, 6);

        Text textInvalidInput = new Text();
        HBox hbTextInvalidInput = new HBox(10);
        hbTextInvalidInput.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidInput.getChildren().add(textInvalidInput);
        grid.add(hbTextInvalidInput, 2,7);

        btnPilih.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textInvalidInput.setText("");

                String pilihan = textFieldPilihan.getText();
                switch (pilihan){
                    case "1":
                        HalamanLoginStudent.halamanLoginStudent(primaryStage);
                        break;
                    case "2":
                        HalamanLoginAdmin.halamanLoginAdmin(primaryStage);
                        break;
                    case "3":
                        primaryStage.close();
                        break;
                    default:
                        textInvalidInput.setFill(Color.FIREBRICK);
                        textInvalidInput.setText("Invalid Input");
                        break;

                }
                textFieldPilihan.setText("");

            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
