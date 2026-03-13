package com.pet.project.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "vehicle")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 17)
    private String vin;

    @Column(name = "body_type", nullable = false, length = 50)
    private String bodyType;

    @Column(name = "battery_capacity", nullable = false, precision = 6, scale = 2)
    private BigDecimal batteryCapacity;

    @Column(nullable = false)
    private Integer year;
}
