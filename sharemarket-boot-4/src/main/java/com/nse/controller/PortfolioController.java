package com.nse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nse.entity.Portfolio;

import com.nse.service.Service;

@RestController
public class PortfolioController {
	
	@Autowired
	private Service service;

	
	@RequestMapping("/createPortfolio")
	public ResponseEntity<Portfolio> createPortfolio(@RequestBody Portfolio p) {
		return new ResponseEntity<>(service.createPortfolio(p),HttpStatus.OK);
		
		
	}
	@RequestMapping("/buyShare/{shareId}/{portfolioId}")
		public boolean buyShare(@PathVariable Integer shareId,@PathVariable Integer portfolioId ) {
			return service.buyShare(shareId,portfolioId);
			
		}
		
	@RequestMapping("/sellShare/{shareId}/{portfolioId}")
	public boolean sellShare(@PathVariable Integer shareId,@PathVariable Integer portfolioId ) {
		return service.sellShare(shareId,portfolioId);
		
	}
		@RequestMapping("/showPortfolio")
		public ResponseEntity<List<Portfolio>> showPortfolio() {
			return new ResponseEntity<>(service.showPortfolio(),HttpStatus.OK);
			
			
		}
		
		
}

