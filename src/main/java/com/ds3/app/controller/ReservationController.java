package com.ds3.app.controller;

import com.ds3.app.model.Reservation;
import com.ds3.app.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> getAll(){
        return reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable Long id){
        return reservationRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation){
        return reservationRepository.save(reservation);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable Long id,@RequestBody Reservation reservation){
        reservation.setId(id);
        return reservationRepository.save(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        reservationRepository.deleteById(id);
    }

}
