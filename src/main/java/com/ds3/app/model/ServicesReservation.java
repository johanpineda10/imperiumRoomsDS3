package com.ds3.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "servicesReservation")
public class ServicesReservation {

    @OneToOne
    @JoinColumn(name = "servicesId", unique = true)
    private Services services;

    @OneToOne
    @JoinColumn(name = "reservationId", unique = true)
    private Reservation reservation;
}
