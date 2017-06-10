package com.dh.demo.web;

import com.dh.demo.domain.Teacher;
import com.dh.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mfloresv on 6/3/2017.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody TeacherRequestDTO newTeacher){
        teacherService.addTeacher(newTeacher);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable String id){
        System.out.println("Borrado");
        teacherService.deleteTeacherById(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void updateTeacher(@PathVariable String id,@RequestBody Teacher teacher){
        System.out.println("Update");
        teacherService.updateTeacherById(id,teacher);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Teacher getTeacherById(@PathVariable String id){
        System.out.println("Teacher id "+teacherService.getTeacherById(id));
        return teacherService.getTeacherById(id);
    }

    //DTO

    public static class TeacherRequestDTO{
        private String name;
        private long ci;
        private String profession;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
    }
}
