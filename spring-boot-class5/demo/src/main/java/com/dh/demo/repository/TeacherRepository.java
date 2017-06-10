package com.dh.demo.repository;

import com.dh.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by mfloresv on 6/3/2017.
 */
public interface TeacherRepository extends MongoRepository<Teacher,String>{

//    @Query("{name:?0,ci:?1}")
//    Teacher getTeacherById(String id){
//
//    }

}
