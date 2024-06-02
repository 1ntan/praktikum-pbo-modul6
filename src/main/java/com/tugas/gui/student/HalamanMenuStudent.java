package com.tugas.gui.student;

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

public class HalamanMenuStudent {
    static void halamanMenuStudent(Stage stageLoginStudent) {
        stageLoginStudent.close();

        Stage stageMenuStudent =  new Stage();
        stageMenuStudent.setTitle("Menu Student");

        GridPane gridMenuStudent = new GridPane();
        gridMenuStudent.setAlignment(Pos.CENTER);
        gridMenuStudent.setHgap(10);
        gridMenuStudent.setVgap(10);
        gridMenuStudent.setPadding(new Insets(25, 25, 25, 25));

        Text textJudulMenuStudent = new Text("Menu Student");
        textJudulMenuStudent.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hbTextJudulMenuStudent = new HBox(10);
        hbTextJudulMenuStudent.setAlignment(Pos.CENTER);
        hbTextJudulMenuStudent.getChildren().add(textJudulMenuStudent);
        gridMenuStudent.add(hbTextJudulMenuStudent, 2, 0);

        Text textTampilInfoMahasiswa = new Text("0. Tampilkan Info Mahasiswa");
        gridMenuStudent.add(textTampilInfoMahasiswa, 2, 1);

        Text textTampilBukuDipinjam = new Text("1. Tampilkan Buku yang Dapat Dipinjam");
        gridMenuStudent.add(textTampilBukuDipinjam, 2, 2);

        Text textBukuTerpinjam = new Text("2. Buku Terpinjam");
        gridMenuStudent.add(textBukuTerpinjam, 2, 3);

        Text textPinjamBuku = new Text("3. Pinjam Buku");
        gridMenuStudent.add(textPinjamBuku, 2, 4);

        Text textKembalikanBuku = new Text("4. Kembalikan Buku");
        gridMenuStudent.add(textKembalikanBuku, 2, 5);

        Text textKeluar = new Text("5. Keluar");
        gridMenuStudent.add(textKeluar, 2, 6);

        Text textMasukkanPilihanStudent = new Text("Masukkan Pilihan:");
        gridMenuStudent.add(textMasukkanPilihanStudent, 2, 7);

        TextField textFieldPilihanStudent = new TextField();
        textFieldPilihanStudent.setPromptText("Angka 1 - 5");
        gridMenuStudent.add(textFieldPilihanStudent, 2, 8);

        Button btnPilihanStudent = new Button("Pilih");
        HBox hbBtnPilihanStudent = new HBox(10);
        hbBtnPilihanStudent.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnPilihanStudent.getChildren().add(btnPilihanStudent);
        gridMenuStudent.add(hbBtnPilihanStudent, 2, 9);

        Text textInvalidInput = new Text();
        HBox hbTextInvalidInput = new HBox(10);
        hbTextInvalidInput.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidInput.getChildren().add(textInvalidInput);
        gridMenuStudent.add(hbTextInvalidInput, 2,10);

        btnPilihanStudent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textInvalidInput.setText("");

                String pilihan = textFieldPilihanStudent.getText();
                switch (pilihan){
                    case "0":
                        System.out.println("Tampilkan info Mahasiswa");
                        break;
                    case "1":
                        System.out.println("Tampilkan Buku yang Dapat Dipinjam");
                        break;
                    case "2":
                        System.out.println("Buku Terpinjam");
                        break;
                    case "3":
                        System.out.println("Pinjam Buku");
                        break;
                    case "4":
                        System.out.println("Kembalikan Buku");
                        break;
                    case "5":
                        stageMenuStudent.close();
                        stageLoginStudent.show();
                        break;
                    default:
                        textInvalidInput.setFill(Color.FIREBRICK);
                        textInvalidInput.setText("Invalid Input");
                        break;
                }
            }
        });
        Scene sceneMenuStudent = new Scene(gridMenuStudent, 300, 350);
        stageMenuStudent.setScene(sceneMenuStudent);
        stageMenuStudent.show();
    }
}
