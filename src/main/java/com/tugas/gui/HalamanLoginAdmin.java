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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HalamanLoginAdmin {
    static void halamanLoginAdmin(Stage primaryStage) {
        primaryStage.close();

        Stage stageLoginAdmin = new Stage();
        stageLoginAdmin.setTitle("Login Admin");

        GridPane gridLoginAdmin = new GridPane();
        gridLoginAdmin.setAlignment(Pos.CENTER);
        gridLoginAdmin.setHgap(10);
        gridLoginAdmin.setVgap(10);
        gridLoginAdmin.setPadding(new Insets(25, 25, 25, 25));

        // judul
        Text textTitleLoginAdmin = new Text("Login Admin");
        textTitleLoginAdmin.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridLoginAdmin.add(textTitleLoginAdmin, 0, 0, 2, 1);

        // label username
        Label userName = new Label("Username:");
        gridLoginAdmin.add(userName, 0, 1);

        // textfield username
        TextField textFieldUserName = new TextField();
        textFieldUserName.setPromptText ("Masukkan username");
        gridLoginAdmin.add(textFieldUserName, 1, 1);

        // label password
        Label passWord = new Label("Password:");
        gridLoginAdmin.add(passWord, 0, 2);

        // textfield password
        TextField textFieldPassWord = new TextField();
        textFieldPassWord.setPromptText ("Masukkan password");
        gridLoginAdmin.add(textFieldPassWord, 1, 2);

        // membuat tombol sign in admin
        Button btnSignInLoginAdmin =  new Button("Sign in");
        HBox hbBtnSignInLoginAdmin = new HBox(10);
        hbBtnSignInLoginAdmin.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnSignInLoginAdmin.getChildren().add(btnSignInLoginAdmin);
        gridLoginAdmin.add(hbBtnSignInLoginAdmin, 1, 5);

        // membuat tombol back
        Button btnBackLoginAdmin =  new Button("Back");
        HBox hbBtnBackLoginAdmin = new HBox(10);
        hbBtnBackLoginAdmin.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnBackLoginAdmin.getChildren().add(btnBackLoginAdmin);
        gridLoginAdmin.add(hbBtnBackLoginAdmin, 0, 5);

        // membuat text salah inputan
        final Text textInvalidAdmin = new Text();
        HBox hbTextInvalidAdmin = new HBox(10);
        hbTextInvalidAdmin.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidAdmin.getChildren().add(textInvalidAdmin);
        gridLoginAdmin.add(hbTextInvalidAdmin, 1,6);

        btnSignInLoginAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String userNameCek = textFieldUserName.getText();
                String passWordCek = textFieldPassWord.getText();
                if (!userNameCek.equals("admin") || !passWordCek.equals("admin")){
                    textInvalidAdmin.setFill(Color.FIREBRICK);
                    textInvalidAdmin.setText("Invalid Account");
                } else {
                    HalamanMenuAdmin.halamanMenuAdmin(stageLoginAdmin);
                    textFieldUserName.setText("");
                    textFieldPassWord.setText("");
                }
            }
        });

        // mengatur fungsi tombol back
        btnBackLoginAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stageLoginAdmin.close();
                primaryStage.show();
            }
        });

        // menampilkan stage login admin
        Scene sceneLoginAdmin = new Scene(gridLoginAdmin, 300, 275);
        stageLoginAdmin.setScene(sceneLoginAdmin);
        stageLoginAdmin.show();
    }

}
