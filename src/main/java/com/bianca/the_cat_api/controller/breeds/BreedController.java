package com.bianca.the_cat_api.controller.breeds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreedController {

    @GetMapping("/breeds")
    public String getBreeds() {
        return "Lista de raças de gatos";
    }
}
