package com.crickapis.services;

import java.util.List;
import java.util.Map;

import com.crickapis.entities.Match;

public interface MatchService {
	
	//get all  Matches
	List<Match> getAllMatches();
	
	//get all Live Match Score
	List<Match> getLiveMatchScores();

	//get cw2023 points table
	List<List<String>> getPointTable();

}
