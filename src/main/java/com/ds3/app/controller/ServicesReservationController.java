package com.ds3.app.controller;

import com.ds3.app.model.Reservation;
import com.ds3.app.model.Services;
import com.ds3.app.model.ServicesReservation;
import com.ds3.app.repository.AccountsRepository;
import com.ds3.app.repository.ServicesReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/servicesReservation")
public class ServicesReservationController {
    @Autowired
    private ServicesReservationRepository servicesReservationRepository;

    @GetMapping
    public List<ServicesReservation> getAll(){
        return servicesReservationRepository.findAll();
    }

    @GetMapping("/{id}")
    public ServicesReservation getById(@PathVariable Long id){
        return servicesReservationRepository.findById(id).orElse(null);
    }
}
