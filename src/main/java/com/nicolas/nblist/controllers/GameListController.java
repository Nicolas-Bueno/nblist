package com.nicolas.nblist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.nblist.dto.GameListDTO;
import com.nicolas.nblist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	
	@GetMapping
	public List<GameListDTO> findAll(){
		var result = gameListService.findAll();
		return result;
	}
	
	
}
