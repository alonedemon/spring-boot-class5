package com.dh.demo.web;

import com.dh.demo.domain.Room;
import com.dh.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mfloresv on 6/10/2017.
 */
@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomRequestDTO roomRequestDTO){
        roomService.addRoom(roomRequestDTO);
    }

    public static class RoomRequestDTO{
        private long code;
        private int capacity;

        public long getCode() {
            return code;
        }

        public void setCode(long code) {
            this.code = code;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }
}
