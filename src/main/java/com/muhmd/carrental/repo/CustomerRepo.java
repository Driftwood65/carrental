package com.muhmd.carrental.repo;

import com.muhmd.carrental.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
