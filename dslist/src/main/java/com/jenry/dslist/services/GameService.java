package com.jenry.dslist.services;

import com.jenry.dslist.dto.GameMinDTO;
import com.jenry.dslist.entities.Game;
import com.jenry.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //transforma um objeto Game para GameMinDto
        return dto;
    }
}
