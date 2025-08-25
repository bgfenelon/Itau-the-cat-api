package com.bianca.the_cat_api.services;

import com.bianca.the_cat_api.model.CatBase;
import com.bianca.the_cat_api.repository.CatBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatBaseService {

    @Autowired
    private CatBaseRepository catRepository;

    public CatBase saveCat(CatBase cat) {
        return catRepository.save(cat);
    }

    public List<CatBase> getAllCats() {
        return catRepository.findAll();
    }
}
