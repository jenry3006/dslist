package com.jenry.dslist.controllers;

import com.jenry.dslist.dto.GameListDTO;
import com.jenry.dslist.dto.GameMinDTO;
import com.jenry.dslist.services.GameListService;
import com.jenry.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listid}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listid){
        List<GameMinDTO> result = gameService.findByList(listid);
        return result;
    }

}
