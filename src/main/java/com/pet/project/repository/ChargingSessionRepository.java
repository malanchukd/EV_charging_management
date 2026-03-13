package com.pet.project.repository;

import com.pet.project.model.ChargingSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChargingSessionRepository extends JpaRepository<ChargingSession, Long> {
    List<ChargingSession> findByVehicleId(Long vehicleId);
    List<ChargingSession> findByChargingStationId(Long stationId);

}
