package com.sinrish.SpringJDBCEx.service;

import com.sinrish.SpringJDBCEx.model.Student;
import com.sinrish.SpringJDBCEx.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
