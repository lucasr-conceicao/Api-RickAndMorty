package br.ApiRickAndMorty.usecase.location;

public interface Location {

    LocationResponse findEpisodeById(String id);

    LocationsResponse findAllEpisode();
}
