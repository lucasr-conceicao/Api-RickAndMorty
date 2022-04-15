package br.ApiRickAndMorty.usecase.episode;

public interface Episode {

    EpisodeResponse findEpisodeById(String id);

    EpisodesResponse findAllEpisode();
}
