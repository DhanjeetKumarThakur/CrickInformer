package com.crickapis.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crickapis.entities.Match;
import com.crickapis.services.MatchService;

@RestController
@RequestMapping(name = "/match")
public class MatchController {

	private MatchService matchService;
	
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
	//get live matches
	@GetMapping(name="/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Match>> getAllMatche(){
		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
	 @GetMapping("/point-table")
	    public ResponseEntity<?> getCWC2023PointTable() {
	        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	    }
}
