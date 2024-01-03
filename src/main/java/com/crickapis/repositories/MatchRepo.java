package com.crickapis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crickapis.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {

	//match fetch karna chahta hoon
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
