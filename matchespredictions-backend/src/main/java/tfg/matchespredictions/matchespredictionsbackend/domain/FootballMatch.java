package tfg.matchespredictions.matchespredictionsbackend.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * A Football Match.
 */
@Entity
@Table(name = "footballmatch")
public class FootballMatch implements Serializable {
	
	/*
	 * Attributes
	 * */

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	@SequenceGenerator(name = "sequenceGenerator")
	private Long id;

	@Column(name="Date")
	private Date matchDate;

	@Column(name="HomeTeam")
	private String homeTeam;	

	@Column(name="AwayTeam")
	private String awayTeam;
	
	@Column(name="FTHG")
	private Integer homeGoals;
	
	@Column(name="FTAG")
	private Integer awayGoals;
	
	@Column(name="FTR")
	private String matchResult;

	
	/*
	 * Getters & Setters
	 * */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Integer getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(Integer homeGoals) {
		this.homeGoals = homeGoals;
	}

	public Integer getAwayGoals() {
		return awayGoals;
	}

	public void setAwayGoals(Integer awayGoals) {
		this.awayGoals = awayGoals;
	}

	public String getMatchResult() {
		return matchResult;
	}

	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}

	
	/*
	 * Attributes
	 * */
	
	@Override
	public String toString() {
		return "Match: " + homeTeam + " vs " + awayTeam + "| Result: " + homeGoals + " - " + awayGoals;
	}
}