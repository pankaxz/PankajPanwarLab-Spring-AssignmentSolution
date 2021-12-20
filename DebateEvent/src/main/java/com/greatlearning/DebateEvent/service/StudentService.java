package com.greatlearning.DebateEvent.service;

import com.greatlearning.DebateEvent.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student findStudentByID(int id);
    void deleteStudent(int id);
    void saveStudent(Student newStudent);
}
