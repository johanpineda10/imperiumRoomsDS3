package com.ds3.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is requested")
    @Column(nullable = false)
    private String userName;

    @NotBlank(message = "Email is requested")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "Age is requested")
    @Column(nullable = false)
    private Integer age;

    @NotBlank(message = "phone is requested")
    @Column(nullable = false)
    private String phone;
}
