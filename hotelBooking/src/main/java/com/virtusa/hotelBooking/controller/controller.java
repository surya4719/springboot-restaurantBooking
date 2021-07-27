package com.virtusa.hotelBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.hotelBooking.model.reservation;
import com.virtusa.hotelBooking.service.service;

import java.util.List;

@RestController
@RequestMapping("/users")
public class controller {
	@Autowired
	private service sc;
	
	@RequestMapping(value="/reservations",method=RequestMethod.GET)
	public List getAllReservations() {
		return sc.getAllReservations();	
	}
	
	@RequestMapping(value="/reservations/{id}",method=RequestMethod.GET)
	public reservation getReservation(@PathVariable Long id) {
		return sc.getReservation(id);
	}
	
	@RequestMapping(value = "/reservations", method =RequestMethod.POST)
	public void addReservation(@RequestBody reservation res) {
		sc.addReservation(res);
	}
	
	@RequestMapping(value = "/reservations/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody reservation res,@PathVariable Long id) {
		sc.updateReservation(id, res);
	}
	@RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable Long id) {
		sc.deleteReservation(id);
	}
	
	

}
