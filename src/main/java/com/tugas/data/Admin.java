package com.tugas.data;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudentList(Student student){
        this.studentList.add(student);
    }
}
