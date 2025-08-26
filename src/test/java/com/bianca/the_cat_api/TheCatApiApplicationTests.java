package com.bianca.the_cat_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bianca.the_cat_api.model.Breed;
import com.bianca.the_cat_api.services.CatApiService;

import static org.assertj.core.api.Assertions.assertThat;



@SpringBootTest
class TheCatApiApplicationTests {

    @Autowired
    private CatApiService catApiService;

	 @Test
    void contextLoads() {
        // Testa se o contexto inicializa corretamente
        assertThat(catApiService).isNotNull();
        System.out.println("Contexto Spring Boot carregado com sucesso!");
    }

	//API capaz de listar todas as raças;
    @Test
    void testGetBreeds() {
        // Chama o serviço real (integração com API)
        Breed[] breeds = catApiService.getBreeds();

        // Verifica se o retorno não é nulo e tem pelo menos um item
        assertThat(breeds).isNotNull();
        assertThat(breeds.length).isGreaterThan(0);

        // Mostra alguns dados no console
        for (Breed breed : breeds) {
            System.out.println("Varias Raça: " + breed.getRaca() + ", Origem: " + breed.getOrigin());
        }
    }

	//API capaz de listar as informações de uma raça;
    @Test
    void testGetBreed() {
        Breed[] breeds = catApiService.getBreed("Abyssinian");

        assertThat(breeds).isNotNull();
        assertThat(breeds.length).isGreaterThan(0);

        
        for (Breed breed : breeds) {
            System.out.println("Uma Raça: " + breed);
        }
    }

	//API capaz de a partir de um temperamento listar as raças;
    @Test
    void testGetBreedTemperamento() {
        Breed[] breeds = catApiService.getBreedTemperament("American Shorthair","Active, Curious, Easy Going, Playful, Calm");

        assertThat(breeds).isNotNull();
        assertThat(breeds.length).isGreaterThan(0);

        
        for (Breed breed : breeds) {
            System.out.println("Uma Raça Temperamento: " + breed);
        }
    }

	//API capaz de a partir de uma origem listar as raças.
    @Test
    void testGetBreedOrigem() {
        Breed[] breeds = catApiService.getBreedOrigin("Abyssinian","Egypt");

        assertThat(breeds).isNotNull();
        assertThat(breeds.length).isGreaterThan(0);

        
        for (Breed breed : breeds) {
            System.out.println("Uma Raça Origem: " + breed);
        }
    }

}
