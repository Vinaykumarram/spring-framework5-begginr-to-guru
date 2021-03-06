package com.vinay.flightreservation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinay.flightreservation.entities.Flight;
import com.vinay.flightreservation.repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findOne(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReserevation";
	}
}
	