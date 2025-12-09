package com.ds3.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "rooms")
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Describe is requested")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Status is requested")
    @Column(nullable = false)
    private String status;

    @NotBlank(message = "Type is requested")
    @Column(nullable = false)
    private String type;
}
