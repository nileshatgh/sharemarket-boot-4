package com.nse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nse.entity.Portfolio;

public interface PortfolioRepo extends JpaRepository<Portfolio, Integer> {

}
