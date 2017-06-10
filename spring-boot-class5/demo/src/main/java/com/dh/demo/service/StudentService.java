package com.dh.demo.service;

import com.dh.demo.domain.Student;
import com.dh.demo.repository.StudentRepository;
import com.dh.demo.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.dh.demo.web.StudentController.*;

/**
 * Created by mfloresv on 6/10/2017.
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public void addNewStudent(StudentRequestDTO student){
        Student newStudent=new Student();
        newStudent.setCi(student.getCi());
        newStudent.setCodeSis(student.getCodeSis());
        newStudent.setName(student.getName());
        studentRepository.save(newStudent);
    }
}
