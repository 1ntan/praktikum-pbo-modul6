package com.tugas.gui;

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

public class HalamanMenuAdmin {
    static void halamanMenuAdmin(Stage stageLoginAdmin) {
        stageLoginAdmin.close();

        Stage stageMenuAdmin = new Stage();
        stageMenuAdmin.setTitle("Manu Admin");

        GridPane gridMenuAdmin = new GridPane();
        gridMenuAdmin.setAlignment(Pos.CENTER);
        gridMenuAdmin.setHgap(10);
        gridMenuAdmin.setVgap(10);
        gridMenuAdmin.setPadding(new Insets(25, 25, 25, 25));

        Text textJudulMenuAdmin = new Text("Menu Admin");
        textJudulMenuAdmin.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hbTextJudulMenuAdmin = new HBox(10);
        hbTextJudulMenuAdmin.setAlignment(Pos.CENTER);
        hbTextJudulMenuAdmin.getChildren().add(textJudulMenuAdmin);
        gridMenuAdmin.add(hbTextJudulMenuAdmin, 2, 0);

        Text textTambahMahasiswa = new Text("1. Tambahkan Data Mahasiswa");
        gridMenuAdmin.add(textTambahMahasiswa, 2, 1);

        Text textTampilMahasiswa = new Text("2. Tampilkan Data Mahasiswa");
        gridMenuAdmin.add(textTampilMahasiswa, 2, 2);

        Text textTambahBuku = new Text("3. Tambahkan Buku");
        gridMenuAdmin.add(textTambahBuku, 2, 3);

        Text textTampilBuku = new Text("4. Tampilkan Buku");
        gridMenuAdmin.add(textTampilBuku, 2, 4);

        Text textKeluar = new Text("5. Keluar");
        gridMenuAdmin.add(textKeluar, 2, 5);

        Text textMasukkanPilihanAdmin = new Text("Masukkan Pilihan:");
        gridMenuAdmin.add(textMasukkanPilihanAdmin, 2, 6);

        TextField textFieldPilihanAdmin = new TextField();
        textFieldPilihanAdmin.setPromptText("Angka 1 - 5");
        gridMenuAdmin.add(textFieldPilihanAdmin, 2, 7);

        Button btnPilihanAdmin = new Button("Pilih");
        HBox hbBtnPilihanAdmin = new HBox(10);
        hbBtnPilihanAdmin.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnPilihanAdmin.getChildren().add(btnPilihanAdmin);
        gridMenuAdmin.add(hbBtnPilihanAdmin, 2, 8);

        Text textInvalidInput = new Text();
        HBox hbTextInvalidInput = new HBox(10);
        hbTextInvalidInput.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidInput.getChildren().add(textInvalidInput);
        gridMenuAdmin.add(hbTextInvalidInput, 2,9);

        btnPilihanAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textInvalidInput.setText("");

                String pilihan = textFieldPilihanAdmin.getText();
                switch (pilihan){
                    case "1":
                        System.out.println("Tambah Mahasiswa");
                        break;
                    case "2":
                        System.out.println("Tampil Mahasiswa");
                        break;
                    case "3":
                        System.out.println("Tambah Buku");
                        break;
                    case "4":
                        System.out.println("Tampil Buku");
                        break;
                    case "5":
                        stageMenuAdmin.close();
                        stageLoginAdmin.show();
                        break;
                    default:
                        textInvalidInput.setFill(Color.FIREBRICK);
                        textInvalidInput.setText("Invalid Input");
                        break;

                }
            }
        });


        Scene sceneMenuAdmin = new Scene(gridMenuAdmin, 300, 325);
        stageMenuAdmin.setScene(sceneMenuAdmin);
        stageMenuAdmin.show();
    }
}
