package com.dh.demo.service;

import com.dh.demo.domain.Subscription;
import com.dh.demo.repository.*;
import com.dh.demo.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mfloresv on 6/10/2017.
 */
@Service
public class SubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    SubjectRepository subjectRepository;
    public List<Subscription> getAllSubscription(){
        return subscriptionRepository.findAll();
    }

    public void addNewSubscription(SubscriptionController.SubscriptionRequestDTO subscription){
        Subscription newSubscription=new Subscription();
        newSubscription.setSuscriptionDate(subscription.getSuscriptionDate());
        newSubscription.setStudent(studentRepository.findOne(subscription.getStudentId()));
        newSubscription.setTeacher(teacherRepository.findOne(subscription.getTeacherId()));
        newSubscription.setRoom(roomRepository.findOne(subscription.getRoomId()));
        newSubscription.setSubject(subjectRepository.findOne(subscription.getSubjectId()));
        subscriptionRepository.save(newSubscription);

    }
}
