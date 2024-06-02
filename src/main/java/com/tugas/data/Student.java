package com.tugas.data;

import com.tugas.books.Book;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String nim;
    private String faculty;
    private String programStudi;

    private static List<Book> borrowedBooks = new ArrayList<>();

    public Student(String name, String nim, String faculty, String programStudi){
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudi = programStudi;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String displayStudents() {
        return "\nNama: " + name + "\nNim: " + nim + "\nJurusan: " + programStudi + "\nFakultas: " + faculty;
    }
}
