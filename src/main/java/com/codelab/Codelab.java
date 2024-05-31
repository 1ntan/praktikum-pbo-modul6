package com.codelab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Codelab extends Application {

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
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        // label username
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        // textfield username
        TextField textFieldUserName = new TextField();
        textFieldUserName.setPromptText ("Masukkan username");
        grid.add(textFieldUserName, 1, 1);

        // label password
        Label passWord = new Label("Password:");
        grid.add(passWord, 0, 2);

        // textfield password
        TextField textFieldPassWord = new TextField();
        textFieldPassWord.setPromptText ("Masukkan password");
        grid.add(textFieldPassWord, 1, 2);

        // membuat tombol
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);

        // menampilkan text salah inputan
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        // mengatur fungsi tombol sign in
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String userNameCek = textFieldUserName.getText();
                String passWordCek = textFieldPassWord.getText();
                if (!userNameCek.equals("intan") || !passWordCek.equals("183")){
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Username atau password salah");
                } else {
                    stageHallo(primaryStage);
                }
            }
        });

        // menampilkan stage utama
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private static void stageHallo(Stage primaryStage) {
        // menutup stage utama
        primaryStage.close();

        // membuat form 2
        Stage stage2 = new Stage();
        stage2.setTitle("Form 2");

        // membuat grid layout
        GridPane grid2 = new GridPane();
        grid2.setAlignment(Pos.CENTER);
        grid2.setHgap(10);
        grid2.setVgap(10);
        grid2.setPadding(new Insets(25, 25, 25, 25));

        // menampilkan text hallo intan
        Text sceneHallo = new Text("Hallo intan");
        grid2.add(sceneHallo, 2, 1);

        // menampilkan tombol kembali
        Button btn2 = new Button("Kembali");
        grid2.add(btn2, 2, 2);

        // mengatur fungsi tombol kembali
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage2.close();
                primaryStage.show();
            }
        });

        // menampilkan stage2
        Scene scene2 = new Scene(grid2, 300, 275);
        stage2.setScene(scene2);
        stage2.show();
    }

    public static void main(String[] args) {
        launch();
    }
}