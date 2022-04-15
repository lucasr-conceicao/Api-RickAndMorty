package br.ApiRickAndMorty.usecase.episode;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class EpisodeImpl implements Episode {

    @Override
    public EpisodeResponse findEpisodeById(String id) {
        return findById(id);
    }

    @Override
    public EpisodesResponse findAllEpisode() {
        return findAll();
    }

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public EpisodeResponse findById(String id) {
        return webClient
                .method(HttpMethod.GET)
                .uri("/episode/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(EpisodeResponse.class)
                .block();
    }

    public EpisodesResponse findAll() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/episode/")
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(EpisodesResponse.class)
                .blockLast();
    }
}
