package com.student.student.service;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // 1. Sabhi students lao
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // 2. ID se ek student lao
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // 3. Naya student save karo
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // 4. Student delete karo
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}