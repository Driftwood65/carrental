package com.muhmd.carrental.repo;

import com.muhmd.carrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
