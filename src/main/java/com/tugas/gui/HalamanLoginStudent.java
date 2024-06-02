package com.tugas.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HalamanLoginStudent {
    static void halamanLoginStudent(Stage primaryStage) {
        primaryStage.close();

        Stage stageLoginStudent = new Stage();
        stageLoginStudent.setTitle("Login Student");

        GridPane gridLoginStudent = new GridPane();
        gridLoginStudent.setAlignment(Pos.CENTER);
        gridLoginStudent.setHgap(10);
        gridLoginStudent.setVgap(10);
        gridLoginStudent.setPadding(new Insets(25, 25, 25, 25));

        // judul
        Text textTitleLoginStudent = new Text("Login Student");
        textTitleLoginStudent.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridLoginStudent.add(textTitleLoginStudent, 0, 0, 2, 1);

        // label username
        Label nim = new Label("NIM:");
        gridLoginStudent.add(nim, 0, 1);

        // textfield username
        TextField textFieldNIM = new TextField();
        textFieldNIM.setPromptText ("Masukkan NIM:");
        gridLoginStudent.add(textFieldNIM, 1, 1);

        // membuat tombol sign in student
        Button btnSignInLoginStudent =  new Button("Sign in");
        HBox hbBtnSignInLoginStudent = new HBox(10);
        hbBtnSignInLoginStudent.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnSignInLoginStudent.getChildren().add(btnSignInLoginStudent);
        gridLoginStudent.add(hbBtnSignInLoginStudent, 1, 5);

        // membuat tombol back
        Button btnBackLoginStudent =  new Button("Back");
        HBox hbBtnBackLoginStudent = new HBox(10);
        hbBtnBackLoginStudent.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnBackLoginStudent.getChildren().add(btnBackLoginStudent);
        gridLoginStudent.add(hbBtnBackLoginStudent, 0, 5);

        // mengatur fungsi tombol back
        btnBackLoginStudent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stageLoginStudent.close();
                primaryStage.show();
            }
        });

        // menampilkan stage2
        Scene sceneLoginStudent = new Scene(gridLoginStudent, 300, 275);
        stageLoginStudent.setScene(sceneLoginStudent);
        stageLoginStudent.show();
    }
}
