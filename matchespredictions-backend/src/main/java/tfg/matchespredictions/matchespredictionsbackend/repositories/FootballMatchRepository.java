package tfg.matchespredictions.matchespredictionsbackend.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tfg.matchespredictions.matchespredictionsbackend.domain.FootballMatch;

@Repository
public interface FootballMatchRepository extends CrudRepository<FootballMatch, Long> {
	
	@Query("SELECT fm FROM FootballMatch fm WHERE fm.homeTeam = ?1 OR fm.awayTeam = ?1" )
	public Collection<FootballMatch> findAllByTeam(String team);
	
	@Query("SELECT fm FROM FootballMatch fm WHERE fm.homeTeam = ?1" )
	public Collection<FootballMatch> findAllByHomeTeam(String homeTeam);
	
	@Query("SELECT fm FROM FootballMatch fm WHERE fm.awayTeam = ?1" )
	public Collection<FootballMatch> findAllByAwayTeam(String awayTeam);

}
