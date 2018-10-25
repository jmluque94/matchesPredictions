package tfg.matchespredictions.matchespredictionsbackend.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A Football Match.
 */
@Entity
@Table(name = "football_match")
public class FootballMatch{
	
	/*
	 * Attributes
	 * */

	@Id
	@Column(name="id")
	private int id;

	@Column(name="date")
	private Date matchDate;

	@Column(name="home_team")
	private String homeTeam;	

	@Column(name="away_team")
	private String awayTeam;
	
	@Column(name="home_goals")
	private Integer homeGoals;
	
	@Column(name="away_goals")
	private Integer awayGoals;
	
	@Column(name="match_result")
	private String matchResult;

	
	/*
	 * Getters & Setters
	 * */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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