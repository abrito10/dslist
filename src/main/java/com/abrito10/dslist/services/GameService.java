package com.abrito10.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.abrito10.dslist.dto.GameDTO;
import com.abrito10.dslist.dto.GameMinDTO;
import com.abrito10.dslist.entities.Game;
import com.abrito10.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

}
