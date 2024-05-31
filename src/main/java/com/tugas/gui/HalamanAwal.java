package com.tugas.gui;

import javafx.application.Application;
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

        Button btnLoginStudent = new Button("Login as Student");
        HBox hbBtnLoginStudent = new HBox(10);
        hbBtnLoginStudent.setAlignment(Pos.CENTER);
        hbBtnLoginStudent.getChildren().add(btnLoginStudent);
        grid.add(hbBtnLoginStudent, 2, 1);

        btnLoginStudent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Button btnLoginAdmin = new Button("Login as Admin");
        HBox hbBtnLoginAdmin = new HBox(10);
        hbBtnLoginAdmin.setAlignment(Pos.CENTER);
        hbBtnLoginAdmin.getChildren().add(btnLoginAdmin);
        grid.add(hbBtnLoginAdmin, 2, 2);

        btnLoginAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                halamanLoginAdmin(primaryStage);
            }
        });

        Button btnExit = new Button("Exit");
        HBox hbBtnExit = new HBox(10);
        hbBtnExit.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnExit.getChildren().add(btnExit);
        grid.add(hbBtnExit, 2, 3);

        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.close();
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void halamanLoginAdmin(Stage primaryStage) {
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
        Label userName = new Label("User Name:");
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

        // mengatur fungsi tombol back
        btnBackLoginAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stageLoginAdmin.close();
                primaryStage.show();
            }
        });

        // menampilkan stage2
        Scene sceneLoginAdmin = new Scene(gridLoginAdmin, 300, 275);
        stageLoginAdmin.setScene(sceneLoginAdmin);
        stageLoginAdmin.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
