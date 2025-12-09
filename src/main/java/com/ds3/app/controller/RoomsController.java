package com.ds3.app.controller;

import com.ds3.app.model.Rooms;
import com.ds3.app.repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rooms")
public class RoomsController {
    @Autowired
    private RoomsRepository roomsRepository;

    @GetMapping
    public List<Rooms> getAll(){
        return roomsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Rooms getById(@PathVariable Long id){
        return roomsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Rooms create(@RequestBody Rooms rooms){
        return roomsRepository.save(rooms);
    }

    @PutMapping("/{id}")
    public Rooms update(@PathVariable Long id, @RequestBody Rooms rooms){
        rooms.setId(id);
        return roomsRepository.save(rooms);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        roomsRepository.deleteById(id);
    }
}
