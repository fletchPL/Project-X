package com.smarttime.repository;

import com.smarttime.model.Business;
import com.smarttime.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by michal.berentowicz on 14.05.2017.
 */
public interface BusinessRepository extends JpaRepository<Business, Long> {
}
