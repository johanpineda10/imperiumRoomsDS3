package com.ds3.app.controller;

import com.ds3.app.model.Users;
import com.ds3.app.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id){
        return usersRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Users create(@RequestBody Users users){
        return usersRepository.save(users);
    }

    @PutMapping("/{id}")
    public Users update(@PathVariable long id, @RequestBody Users users){
        users.setId(id);
        return usersRepository.save(users);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usersRepository.deleteById(id);
    }
}
