package br.ApiRickAndMorty.adapters.controller.character;

import br.ApiRickAndMorty.usecase.character.Character;
import br.ApiRickAndMorty.usecase.character.CharacterResponse;
import br.ApiRickAndMorty.usecase.character.CharactersResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/webclient")
public class CharacterController {

    private final Character character;

    @GetMapping("/character/{id}")
    public CharacterResponse getCharacterById(@PathVariable String id) {
        return character.findCharacterById(id);
    }

    @GetMapping("/character/")
    public CharactersResponse getAllCharacter() {
        return character.findAllCharacter();
    }
}
