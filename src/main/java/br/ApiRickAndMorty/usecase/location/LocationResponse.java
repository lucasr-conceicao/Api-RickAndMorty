package br.ApiRickAndMorty.usecase.location;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LocationResponse {

    private String id;
    private String name;
    private String type;
    private String dimension;
    private String created;
}
