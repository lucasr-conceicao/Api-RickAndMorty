package br.ApiRickAndMorty.usecase.location;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class LocationImpl implements Location {

    @Override
    public LocationResponse findEpisodeById(String id) {
        return findById(id);
    }

    @Override
    public LocationsResponse findAllEpisode() {
        return findAll();
    }

    WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public LocationResponse findById(String id) {
        return webClient
                .method(HttpMethod.GET)
                .uri("/location/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(LocationResponse.class)
                .block();
    }

    public LocationsResponse findAll() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/location/")
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(LocationsResponse.class)
                .blockLast();
    }

}
