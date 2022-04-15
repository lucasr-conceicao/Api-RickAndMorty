package br.ApiRickAndMorty.usecase.character;

public interface Character {

    CharacterResponse findCharacterById(String id);

    CharactersResponse findAllCharacter();
}
