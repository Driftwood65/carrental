package com.muhmd.carrental.repo;

import com.muhmd.carrental.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepo extends JpaRepository<Rental, Long> {

    public List<Rental> findByReturnedNull();
}
