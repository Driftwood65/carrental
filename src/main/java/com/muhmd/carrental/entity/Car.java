package com.muhmd.carrental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private int mileage;
    private String manufacturer;
    private String model;

}
