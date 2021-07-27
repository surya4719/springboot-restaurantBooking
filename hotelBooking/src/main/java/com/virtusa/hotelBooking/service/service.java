package com.virtusa.hotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.virtusa.hotelBooking.model.reservation;
import com.virtusa.hotelBooking.repo.repository;

@Service
public class service {
	
	@Autowired
	private repository rp;
public List getAllReservations() {
	List reservations=new ArrayList<>();
	rp.findAll().forEach(reservations::add);
	return reservations;
}
public reservation getReservation(Long id) {
	return rp.findById(id);
}
	
public void addReservation(reservation rev) {
	rp.save(rev);
}
public void updateReservation(Long id,reservation rev) {
	rp.save(rev);
}
public void deleteReservation(Long id) {
	rp.deleteById(id);
}

}
