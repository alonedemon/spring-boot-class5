package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by mfloresv on 6/10/2017.
 */
@Document
public class Subscription {

    @Id
    private String id;
    @DBRef
    private Teacher teacher;
    @DBRef
    private Student student;
    private Date suscriptionDate;
    @DBRef
    private Room room;
    @DBRef
    private Subject subject;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getSuscriptionDate() {
        return suscriptionDate;
    }

    public void setSuscriptionDate(Date suscriptionDate) {
        this.suscriptionDate = suscriptionDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
