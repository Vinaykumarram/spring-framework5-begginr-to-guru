package com.vinay.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
