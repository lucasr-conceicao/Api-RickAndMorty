package br.ApiRickAndMorty.adapters.controller.location;

import br.ApiRickAndMorty.usecase.location.Location;
import br.ApiRickAndMorty.usecase.location.LocationResponse;
import br.ApiRickAndMorty.usecase.location.LocationsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webclient")
@RequiredArgsConstructor
public class LocationController {

    private final Location location;

    @GetMapping("/location/{id}")
    public LocationResponse getLocationById(@PathVariable String id) {
        return location.findEpisodeById(id);
    }

    @GetMapping("/location/")
    public LocationsResponse getAllLocation() {
        return location.findAllEpisode();
    }


}
