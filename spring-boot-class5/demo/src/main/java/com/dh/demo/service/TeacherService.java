package com.dh.demo.service;

import com.dh.demo.domain.Teacher;
import com.dh.demo.repository.TeacherRepository;
import com.dh.demo.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mfloresv on 6/3/2017.
 */
@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public List<Teacher> getAllTeachers(){
        //TODO use repository
        List<Teacher> teachers=new ArrayList<Teacher>();
//        teachers.add(new Teacher("jv","Jonhy",126366,"ing"));
//        teachers.add(new Teacher("jv","Gabo",126366,"ing"));
//        teachers.add(new Teacher("jv","Suuuu",126366,"ing"));
//        teachers.add(new Teacher("jv","Andi",126366,"ing"));
        teachers=teacherRepository.findAll();
        return teachers;
    }
    public void addTeacher(TeacherController.TeacherRequestDTO teacher){
        //TODO algo
        Teacher newTeacher=new Teacher();
        newTeacher.setCi(teacher.getCi());
        newTeacher.setName(teacher.getName());
        newTeacher.setProfession(teacher.getProfession());
        teacherRepository.save(newTeacher);
        System.out.println("The name of teacher is ---> "+newTeacher.getName());
    }
    public void deleteTeacherById(String id){
        teacherRepository.delete(id);
    }
    public void updateTeacherById(String id,Teacher teacher){
        //teacherRepository.
        Teacher t=teacherRepository.findOne(id);
        teacher.setId(t.getId());
        teacherRepository.save(teacher);
    }
    public Teacher getTeacherById(String id){
        return teacherRepository.findOne(id);
    }
}
