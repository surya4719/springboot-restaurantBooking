package com.virtusa.hotelBooking.repo;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.hotelBooking.model.reservation;

public interface repository extends CrudRepository<reservation,String> {

	

	

	reservation findById(Long id);

	void deleteById(Long id);

	

}
