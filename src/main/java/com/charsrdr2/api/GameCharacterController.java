package com.charsrdr2.api;

import com.charsrdr2.domain.GameCharacter;
import com.charsrdr2.service.GameCharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gamecharacters")
public class GameCharacterController {
    private GameCharacterService gameCharacterService = new GameCharacterService();
    @GetMapping()
    public List<GameCharacter> get(){
        return gameCharacterService.getCharacters();
    }
}
