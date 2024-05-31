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

    public static void main(String[] args) {
        launch();
    }
}
