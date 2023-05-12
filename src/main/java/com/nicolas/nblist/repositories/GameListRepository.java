package com.nicolas.nblist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.nblist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
