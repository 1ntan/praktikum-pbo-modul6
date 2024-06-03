package com.tugas.gui.admin;

import com.tugas.data.Admin;
import com.tugas.data.Student;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
                        halamanInputMahasiswa(stageMenuAdmin);
                        break;
                    case "2":
                        System.out.println("Tampil Mahasiswa");
                        break;
                    case "3":
                        halamanInputBuku(stageMenuAdmin);


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
                textFieldPilihanAdmin.setText("");
            }
        });

        Scene sceneMenuAdmin = new Scene(gridMenuAdmin, 300, 325);
        stageMenuAdmin.setScene(sceneMenuAdmin);
        stageMenuAdmin.show();
    }

    private static void halamanInputBuku(Stage stageMenuAdmin) {
        stageMenuAdmin.close();
//        Admin admin = new admin();

        Stage stageInputBuku = new Stage();
        stageInputBuku.setTitle("Input Buku Baru");

        GridPane gridInputBuku = new GridPane();
        gridInputBuku.setAlignment(Pos.CENTER);
        gridInputBuku.setHgap(10);
        gridInputBuku.setVgap(10);
        gridInputBuku.setPadding(new Insets( 25, 25, 25, 25));

        // judul
        Text textTitleInputBuku = new Text("Masukkan Detail Buku");
        textTitleInputBuku.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridInputBuku.add(textTitleInputBuku, 0, 0, 2, 1 );

        // label id buku
        Label labelID = new Label("ID Buku:");
        gridInputBuku.add(labelID, 0, 1);

        // textfield id buku
        TextField textFieldID = new TextField();
        textFieldID.setPromptText("Masukkan ID Buku");
        gridInputBuku.add(textFieldID, 1, 1);

        // label judul buku
        Label labelJudul = new Label("Judul Buku:");
        gridInputBuku.add(labelJudul, 0, 2);

        // textfield judul buku
        TextField textFieldJudulBuku = new TextField();
        textFieldJudulBuku.setPromptText("Masukkan Judul Buku");
        gridInputBuku.add(textFieldJudulBuku, 1, 2);

        // label pengarang
        Label labelPengarang = new Label("Pengarang:");
        gridInputBuku.add(labelPengarang, 0, 3);

        // textfield pengarang
        TextField textFieldPengarang = new TextField();
        textFieldPengarang.setPromptText("Masukkan Nama Pengarang");
        gridInputBuku.add(textFieldPengarang, 1, 3);

        // label stok
        Label labelStok = new Label("Stok:");
        gridInputBuku.add(labelStok, 0, 4);

        // textfield stok
        TextField textFieldStok = new TextField();
        textFieldStok.setPromptText("Masukkan Jumlah Stok");
        gridInputBuku.add(textFieldStok, 1, 4);

        // label kategori
        Label labelKategori =  new Label("Kategori");
        gridInputBuku.add(labelKategori, 0, 5);

        // textfield kategori
//        TextField textFieldKategori = new TextField();
//        textFieldKategori.setPromptText("Masukkan Kategori");
//        gridInputBuku.add(textFieldKategori, 1, 5);
        ComboBox opsiKategori = new ComboBox<>();
        opsiKategori.getItems().addAll(
          "Cerita",
                "Sejarah",
                "Teks"
        );
        gridInputBuku.add(opsiKategori, 1, 5);

        // membuat tombol tambah buku baru
        Button btnTambahBukuBaru = new Button("Tambah");
        HBox hbBtnTambahBukuBaru = new HBox(10);
        hbBtnTambahBukuBaru.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnTambahBukuBaru.getChildren().add(btnTambahBukuBaru);
        gridInputBuku.add(hbBtnTambahBukuBaru, 1, 6);

        // mambuat text salah inputan
        final Text textInvalidInput = new Text();
        HBox hbTextInvalidInput = new HBox(10);
        hbTextInvalidInput.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidInput.getChildren().add(textInvalidInput);
        gridInputBuku.add(hbTextInvalidInput, 1,7);

        btnTambahBukuBaru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String idBuku = textFieldID.getText();
                String judul = textFieldJudulBuku.getText();
                String pengarang = textFieldPengarang.getText();
                int kategori = opsiKategori.getSelectionModel().getSelectedIndex();
                String stok = textFieldStok.getText();

                if (idBuku.isBlank() || judul.isBlank() || pengarang.isBlank() || opsiKategori.getSelectionModel().isEmpty() || stok.isBlank()) {
                    textInvalidInput.setFill(Color.FIREBRICK);
                    textInvalidInput.setText("Data Tidak Lengkap");
                } else {
                    textFieldID.setText("");
                    textFieldJudulBuku.setText("");
                    textFieldPengarang.setText("");
                    textFieldStok.setText("");
                    textInvalidInput.setText("");
                    opsiKategori.valueProperty().setValue(null);
                }
            }
        });

        Button btnBackBukuBaru = new Button("Back");
        HBox hbBtnBackBukuBaru = new HBox(10);
        hbBtnBackBukuBaru.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnBackBukuBaru.getChildren().add(btnBackBukuBaru);
        gridInputBuku.add(hbBtnBackBukuBaru, 0, 6);

        btnBackBukuBaru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textFieldID.setText("");
                textFieldJudulBuku.setText("");
                textFieldPengarang.setText("");
                textFieldStok.setText("");

                stageInputBuku.close();
                stageMenuAdmin.show();
            }
        });

        Scene sceneInputBuku = new Scene(gridInputBuku);
        stageInputBuku.setScene(sceneInputBuku);
        stageInputBuku.show();
    }

    private static void halamanInputMahasiswa(Stage stageMenuAdmin) {
        stageMenuAdmin.close();
        Admin admin = new Admin();

        Stage stageInputMahasiswa = new Stage();
        stageInputMahasiswa.setTitle("Input Mahasiswa Baru");

        GridPane gridInputMahasiswa = new GridPane();
        gridInputMahasiswa.setAlignment(Pos.CENTER);
        gridInputMahasiswa.setHgap(10);
        gridInputMahasiswa.setVgap(10);
        gridInputMahasiswa.setPadding(new Insets(25, 25, 25, 25));

        // judul
        Text textTitleInputMahasiswa = new Text("Input Mahasiswa Baru");
        textTitleInputMahasiswa.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridInputMahasiswa.add(textTitleInputMahasiswa, 0, 0, 2, 1);

        // label nama
        Label labelNama = new Label("Nama:");
        gridInputMahasiswa.add(labelNama, 0, 1);

        // textfield nama
        TextField textFieldNama = new TextField();
        textFieldNama.setPromptText ("Masukkan Nama");
        gridInputMahasiswa.add(textFieldNama, 1, 1);

        // label nim
        Label labelNIM = new Label("NIM:");
        gridInputMahasiswa.add(labelNIM, 0, 2);

        // textfield nim
        TextField textFieldNIM = new TextField();
        textFieldNIM.setPromptText ("Masukkan NIM");
        gridInputMahasiswa.add(textFieldNIM, 1, 2);

        // label jurusan
        Label labelJurusan = new Label("Jurusan:");
        gridInputMahasiswa.add(labelJurusan, 0, 3);

        // textfield jurusan
        TextField textFieldJurusan = new TextField();
        textFieldJurusan.setPromptText ("Masukkan Jurusan");
        gridInputMahasiswa.add(textFieldJurusan, 1, 3);

        // label fakultas
        Label labelFakultas = new Label("Fakultas:");
        gridInputMahasiswa.add(labelFakultas, 0, 4);

        // textfield fakultas
        TextField textFieldFakultas = new TextField();
        textFieldFakultas.setPromptText ("Masukkan Fakultas");
        gridInputMahasiswa.add(textFieldFakultas, 1, 4);

        // membuat tombol tambah mahasiswa baru
        Button btnTambahMahasiswaBaru =  new Button("Tambah");
        HBox hbBtnTambahMahasiswaBaru = new HBox(10);
        hbBtnTambahMahasiswaBaru.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnTambahMahasiswaBaru.getChildren().add(btnTambahMahasiswaBaru);
        gridInputMahasiswa.add(hbBtnTambahMahasiswaBaru, 1, 6);

        // membuat text salah inputan
        final Text textInvalidInput = new Text();
        HBox hbTextInvalidInput = new HBox(10);
        hbTextInvalidInput.setAlignment(Pos.BOTTOM_RIGHT);
        hbTextInvalidInput.getChildren().add(textInvalidInput);
        gridInputMahasiswa.add(hbTextInvalidInput, 1,7);

        btnTambahMahasiswaBaru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String nama = textFieldNama.getText();
                String nim = textFieldNIM.getText();
                String jurusan = textFieldJurusan.getText();
                String fakultas = textFieldFakultas.getText();

                if (nama.isBlank() || nim.isBlank() || jurusan.isBlank() || fakultas.isBlank()){
                    textInvalidInput.setFill(Color.FIREBRICK);
                    textInvalidInput.setText("Data Tidak Lengkap");
                } else if (nim.length() != 15) {
                    textInvalidInput.setFill(Color.FIREBRICK);
                    textInvalidInput.setText("Invalid NIM Format");
                } else {
                    Student student = new Student(nama, nim, fakultas, jurusan);
                    admin.addStudentList(student);

                    //nanti dihapus v
                    for (Student mahasiswa : admin.getStudentList()) {
                        System.out.println(mahasiswa.displayStudents());
                    }
                    //nanti dihapus ^

                    textFieldNama.setText("");
                    textFieldNIM.setText("");
                    textFieldJurusan.setText("");
                    textFieldFakultas.setText("");

                    stageInputMahasiswa.close();
                    stageMenuAdmin.show();
                }

            }
        });

        // membuat tombol back
        Button btnBackMahasiswaBaru =  new Button("Back");
        HBox hbBtnBackMahasiswaBaru = new HBox(10);
        hbBtnBackMahasiswaBaru.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnBackMahasiswaBaru.getChildren().add(btnBackMahasiswaBaru);
        gridInputMahasiswa.add(hbBtnBackMahasiswaBaru, 0, 6);

        btnBackMahasiswaBaru.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stageInputMahasiswa.close();
                stageMenuAdmin.show();
            }
        });


        Scene sceneInputMahasiswa = new Scene(gridInputMahasiswa, 300, 275);
        stageInputMahasiswa.setScene(sceneInputMahasiswa);
        stageInputMahasiswa.show();
    }
}
