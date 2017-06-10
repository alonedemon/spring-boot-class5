package com.dh.demo.web;

import com.dh.demo.domain.Subject;
import com.dh.demo.repository.SubjectRepository;
import com.dh.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mfloresv on 6/10/2017.
 */
@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addSubject(@RequestBody SubjectRequestDTO subjectRequestDTO){
        subjectService.addSubject(subjectRequestDTO);
    }

    public static class SubjectRequestDTO{
        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
