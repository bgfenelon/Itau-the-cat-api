package com.bianca.the_cat_api.repository;

import com.bianca.the_cat_api.model.CatBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatBaseRepository extends MongoRepository<CatBase, String> {
    // Você pode adicionar métodos customizados aqui se precisar
}
