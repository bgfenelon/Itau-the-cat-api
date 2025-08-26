package com.bianca.the_cat_api.controller;

import com.bianca.the_cat_api.model.Breed;
import com.bianca.the_cat_api.services.CatApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Breed[] getBreed(@RequestParam String breed) {
        return catApiService.getBreed(breed);
    }

    @GetMapping("/breedTemperament")
    public Breed[] getBreedTemperament(@RequestParam String breed,
        @RequestParam String temperament) {
        return catApiService.getBreedTemperament(breed,temperament);
    }

    @GetMapping("/breedOrigin")
    public Breed[] getBreedOrigin(@RequestParam String breed,
        @RequestParam String origin) {
        return catApiService.getBreedOrigin(breed,origin);
    }

}
