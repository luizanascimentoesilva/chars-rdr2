package com.charsrdr2.service;

import com.charsrdr2.domain.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class GameCharacterService {
    public List<GameCharacter> getCharacters() {
        List<GameCharacter> characters = new ArrayList<>();

        characters.add(new GameCharacter(1L, "Arthur Morgan"));
        characters.add(new GameCharacter(2L, "John Marston"));
        characters.add(new GameCharacter(3L, "Jack Marston"));

        return characters;
    }
}
