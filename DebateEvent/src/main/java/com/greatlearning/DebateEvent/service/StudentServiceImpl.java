package com.greatlearning.DebateEvent.service;

import com.greatlearning.DebateEvent.entities.Student;
import com.greatlearning.DebateEvent.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {return studentRepository.findAll();}

    @Override
    public Student findStudentByID(int id) {return studentRepository.getById(id);}

    @Override
    public void saveStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
