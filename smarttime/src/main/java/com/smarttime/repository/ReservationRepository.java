package com.smarttime.repository;

import com.smarttime.model.Business;
import com.smarttime.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by michal.berentowicz on 14.05.2017.
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
