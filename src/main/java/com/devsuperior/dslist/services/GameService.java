package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMiniDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service //Registrando no sistemas o componente para o Spring
 public class GameService {
		
	@Autowired //injetando uma instancia no GameService
	private GameRepository gameRepository;
	 
	public List<GameMiniDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}
}
