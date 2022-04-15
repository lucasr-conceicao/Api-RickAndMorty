package br.ApiRickAndMorty.usecase.character;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class CharacterImpl implements Character {

    @Override
    public CharacterResponse findCharacterById(String id) {
        return findById(id);
    }

    @Override
    public CharactersResponse findAllCharacter() {
        return findAll();
    }

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public CharacterResponse findById(String id) {
        return webClient
                .method(HttpMethod.GET)
                .uri("/character/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CharacterResponse.class)
                .block();
    }

    public CharactersResponse findAll() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/character/")
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(CharactersResponse.class)
                .blockLast();
    }
}
