package com.nicolas.nblist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.nblist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
