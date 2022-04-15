package br.ApiRickAndMorty.usecase.episode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class EpisodesResponse {

    @JsonProperty("results")
    private List<EpisodeResponse> results;
}
