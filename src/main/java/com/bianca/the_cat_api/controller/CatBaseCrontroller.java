package com.bianca.the_cat_api.controller;

import com.bianca.the_cat_api.model.CatBase;
import com.bianca.the_cat_api.services.CatBaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatBaseCrontroller {

    @Autowired
    private CatBaseService catBaseService;


    @GetMapping
    public List<CatBase> getCats() {
        return catBaseService.getAllCats();
    }
    
}
