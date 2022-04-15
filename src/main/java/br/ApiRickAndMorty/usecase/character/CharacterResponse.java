package br.ApiRickAndMorty.usecase.character;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CharacterResponse {

    private String id;
    private String name;
    private String status;
    private String species;
    private String gender;
    private String image;
    private Location location;
    private String created;

    @Data
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static class Location {
        private String name;
    }
}

