package br.ApiRickAndMorty.adapters.controller.episode;

import br.ApiRickAndMorty.usecase.episode.Episode;
import br.ApiRickAndMorty.usecase.episode.EpisodeResponse;
import br.ApiRickAndMorty.usecase.episode.EpisodesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/webclient")
public class EpisodeController {

    private final Episode episode;

    @GetMapping("/episode/{id}")
    public EpisodeResponse getEpisodeById(@PathVariable String id) {
        return episode.findEpisodeById(id);
    }

    @GetMapping("/episode/")
    public EpisodesResponse getAllEpisode() {
        return episode.findAllEpisode();
    }
}
