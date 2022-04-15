package br.ApiRickAndMorty.usecase.episode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EpisodeResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("air_date")
    private String airDate;

    @JsonProperty("episode")
    private String episode;

    @JsonProperty("created")
    private String created;
}
