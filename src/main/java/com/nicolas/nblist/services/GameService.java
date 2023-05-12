package com.nicolas.nblist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nicolas.nblist.dto.GameDTO;
import com.nicolas.nblist.dto.GameMinDTO;
import com.nicolas.nblist.entities.Game;
import com.nicolas.nblist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id){
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO>dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
