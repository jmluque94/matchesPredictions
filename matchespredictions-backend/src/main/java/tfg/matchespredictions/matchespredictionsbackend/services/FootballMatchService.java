package tfg.matchespredictions.matchespredictionsbackend.services;

import java.util.Collection;
import java.util.Optional;

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
	
	public Optional<FootballMatch> findOne(Long id) {
		return footballMatchRepository.findById(id);
	}
	
	public Collection<FootballMatch> findAll(){
		return footballMatchRepository.findAll();
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
