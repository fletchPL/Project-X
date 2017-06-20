package com.smarttime.repository;

import com.smarttime.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by michal.berentowicz on 14.05.2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
