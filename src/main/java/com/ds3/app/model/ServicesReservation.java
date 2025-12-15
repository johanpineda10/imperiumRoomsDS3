package com.ds3.app.model;

import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "servicesId", unique = true)
    private Services services;

    @OneToOne
    @JoinColumn(name = "reservationId", unique = true)
    private Reservation reservation;
}
