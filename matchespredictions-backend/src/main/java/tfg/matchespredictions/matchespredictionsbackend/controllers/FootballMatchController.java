package tfg.matchespredictions.matchespredictionsbackend.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tfg.matchespredictions.matchespredictionsbackend.domain.FootballMatch;
import tfg.matchespredictions.matchespredictionsbackend.services.FootballMatchService;

/**
 * REST controller for football matchs.
 */
@RestController
@RequestMapping("/match")
public class FootballMatchController {

	/*
	 * Services supported
	 * */
	
	@Autowired
	protected FootballMatchService footballMatchService;


	
	/**
	 * 
	 * Get all football matches
	 * 
	 * @return Collection: All football matches
	 */
	@GetMapping("/all")
	public Collection<FootballMatch> findAll() {
		return footballMatchService.findAll();
	}

}
