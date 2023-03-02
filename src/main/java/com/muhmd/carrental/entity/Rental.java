package com.muhmd.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rental {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Car car;
    @ManyToOne
    private Customer customer;

    private Double mileage;
    private LocalDate returned;


}
