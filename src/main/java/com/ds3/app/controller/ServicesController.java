package com.ds3.app.controller;

import com.ds3.app.model.Services;
import com.ds3.app.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/services")
public class ServicesController {
    @Autowired
    private ServicesRepository servicesRepository;

    @GetMapping
    public List<Services> getAll(){
        return servicesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Services getById(@PathVariable Long id){
        return servicesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Services create(@RequestBody Services services){
        return servicesRepository.save(services);
    }

    @PutMapping("/{id}")
    public Services update(@PathVariable Long id,@RequestBody Services services){
        services.setId(id);
        return servicesRepository.save(services);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        servicesRepository.deleteById(id);
    }

}
