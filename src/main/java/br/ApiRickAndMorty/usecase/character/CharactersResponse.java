package br.ApiRickAndMorty.usecase.character;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CharactersResponse {

    private List<CharacterResponse> results;
}
