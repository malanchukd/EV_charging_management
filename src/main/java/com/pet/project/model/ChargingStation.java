package com.pet.project.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "charging_station")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ChargingStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "power_kw", nullable = false, precision = 8, scale = 2)
    private BigDecimal powerKw;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private StationStatus status;
}
