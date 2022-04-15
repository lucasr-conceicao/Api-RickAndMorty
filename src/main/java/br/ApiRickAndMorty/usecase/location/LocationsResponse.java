package br.ApiRickAndMorty.usecase.location;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LocationsResponse {

    private List<LocationResponse> results;
}
