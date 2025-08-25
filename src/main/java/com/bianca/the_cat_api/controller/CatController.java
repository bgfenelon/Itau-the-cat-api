package com.bianca.the_cat_api.controller;

import com.bianca.the_cat_api.model.Breed;
import com.bianca.the_cat_api.services.CatApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    private final CatApiService catApiService;

    public CatController(CatApiService catApiService) {
        this.catApiService = catApiService;
    }

    @GetMapping("/breeds")
    public Breed[] getBreeds() {
        return catApiService.getBreeds();
    }

    @GetMapping("/breed")
    public String getBreed() {
        return catApiService.getBreed("Abyssinian");
    }

    @GetMapping("/breedTemperament")
    public String getBreedTemperament() {
        return catApiService.getBreedTemperament("American Shorthair","Active, Curious, Easy Going, Playful, Calm");
    }

    @GetMapping("/breedOrigin")
    public String getBreedOrigin() {
        return catApiService.getBreedOrigin("Abyssinian","Egypt");
    }

}
