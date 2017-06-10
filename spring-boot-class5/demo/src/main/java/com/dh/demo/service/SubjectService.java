package com.dh.demo.service;

import com.dh.demo.domain.Subject;
import com.dh.demo.repository.SubjectRepository;
import com.dh.demo.web.SubjectController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by mfloresv on 6/10/2017.
 */
@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public void addSubject(SubjectController.SubjectRequestDTO subjectRequestDTO){
        Subject subject=new Subject();
        subject.setName(subjectRequestDTO.getName());
        subject.setCode(subjectRequestDTO.getCode());
        subjectRepository.save(subject);
    }
}
