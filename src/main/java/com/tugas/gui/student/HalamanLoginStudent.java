package com.tugas.gui.student;

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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HalamanLoginStudent {
    public static void halamanLoginStudent(Stage primaryStage) {
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

        // label nim
        Label nim = new Label("NIM:");
        gridLoginStudent.add(nim, 0, 1);

        // textfield nim
        TextField textFieldNIM = new TextField();
        textFieldNIM.setPromptText ("Masukkan NIM:");
        gridLoginStudent.add(textFieldNIM, 1, 1);

        // membuat tombol sign in student
        Button btnSignInLoginStudent =  new Button("Sign in");
        HBox hbBtnSignInLoginStudent = new HBox(10);
        hbBtnSignInLoginStudent.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnSignInLoginStudent.getChildren().add(btnSignInLoginStudent);
        gridLoginStudent.add(hbBtnSignInLoginStudent, 1, 5);

        Text textInvalidNIM = new Text();
        HBox hbTextInvalidNIM = new HBox(10);
        hbTextInvalidNIM.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidNIM.getChildren().add(textInvalidNIM);
        gridLoginStudent.add(hbTextInvalidNIM, 1,6);

        btnSignInLoginStudent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textInvalidNIM.setText("");

                String nim = textFieldNIM.getText();
                if (nim.length() == 15) {
                    HalamanMenuStudent.halamanMenuStudent(stageLoginStudent);
                    textFieldNIM.setText("");
                } else {
                    textInvalidNIM.setFill(Color.FIREBRICK);
                    textInvalidNIM.setText("Invalid NIM Format");
                }
            }
        });

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
