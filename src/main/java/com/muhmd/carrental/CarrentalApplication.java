package com.muhmd.carrental;

import com.muhmd.carrental.entity.Car;
import com.muhmd.carrental.entity.Customer;
import com.muhmd.carrental.entity.Rental;
import com.muhmd.carrental.repo.CarRepo;
import com.muhmd.carrental.repo.CustomerRepo;
import com.muhmd.carrental.repo.RentalRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CarrentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrentalApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(CarRepo carRepo, CustomerRepo customerRepo, RentalRepo rentalRepo) {
		return (args) -> {
			carRepo.save(new Car(1L, 500, "VW", "Golf"));
			carRepo.save(new Car(2L, 1000, "Opel", "Corsa"));

			customerRepo.save(new Customer(1L, "David", "Muhm", LocalDate.of(1999, 1, 1)));
			customerRepo.save(new Customer(2L, "Jon", "Doe", LocalDate.of(2001, 10, 11)));

			rentalRepo.save(new Rental(1L, carRepo.findById(1L).get(), customerRepo.findById(1L).get(), null, null));
		};
	}

}
