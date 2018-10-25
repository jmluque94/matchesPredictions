package tfg.matchespredictions.matchespredictionsbackend.services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfg.matchespredictions.matchespredictionsbackend.domain.FootballMatch;
import tfg.matchespredictions.matchespredictionsbackend.repositories.FootballMatchRepository;

@Service
@Transactional
public class FootballMatchService {

	/*
	 * Repositories
	 * */
	
	@Autowired
	protected FootballMatchRepository footballMatchRepository;

	

	/*
	 * CRUD Methods
	 * */
	
	public Collection<FootballMatch> findAll(){
		return (Collection<FootballMatch>) footballMatchRepository.findAll();
	}
	
	/*
	 * Complex Methods
	 * */
	
	public Collection<FootballMatch> findAllByTeam(String team) {
		return footballMatchRepository.findAllByTeam(team);
	}
	
	public Collection<FootballMatch> findAllByHomeTeam(String homeTeam) {
		return footballMatchRepository.findAllByHomeTeam(homeTeam);
	}
	
	public Collection<FootballMatch> findAllByAwayTeam(String awayTeam) {
		return footballMatchRepository.findAllByAwayTeam(awayTeam);
	}
}
