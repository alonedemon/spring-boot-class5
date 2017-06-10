package com.dh.demo.service;

import com.dh.demo.domain.Room;
import com.dh.demo.repository.RoomRepository;
import com.dh.demo.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mfloresv on 6/10/2017.
 */
@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void addRoom(RoomController.RoomRequestDTO roomRequestDTO){
        Room room=new Room();
        room.setCapacity(roomRequestDTO.getCapacity());
        room.setCode(room.getCode());
        roomRepository.save(room);
    }

}
