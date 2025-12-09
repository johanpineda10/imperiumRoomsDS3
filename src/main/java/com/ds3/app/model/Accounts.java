package com.ds3.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Describe is requested")
    @Column(nullable = false)
    private String description;

    @NotNull(message = "Total is requested")
    @Column(nullable = false)
    private BigDecimal total;

    @NotNull(message = "Status is requested")
    @Column(nullable = false)
    private Boolean status;

    @OneToOne
    @JoinColumn(name = "reservationId", unique = true)
    private Reservation reservation;

}
