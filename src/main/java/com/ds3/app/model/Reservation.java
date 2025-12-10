package com.ds3.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
//ENTIDAD DE RESERVACIONES
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation")
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Describe is requested")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "StartDate is requested")
    @Column(nullable = false)
    private LocalDate startDate;

    @NotBlank(message = "EndEDate is requested")
    @Column(nullable = false)
    private LocalDate endDate;

    @NotBlank(message = "CreatedAt is requested")
    @Column(nullable = false)
    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private Rooms room;
}
