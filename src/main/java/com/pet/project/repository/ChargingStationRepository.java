package com.pet.project.repository;

import com.pet.project.model.ChargingStation;
import com.pet.project.model.StationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChargingStationRepository extends JpaRepository<ChargingStation, Long> {
    List<ChargingStation> findByStatus(StationStatus status);
}
