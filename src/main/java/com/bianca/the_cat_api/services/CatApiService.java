package com.bianca.the_cat_api.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bianca.the_cat_api.model.Breed;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClientException;

@Service
public class CatApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    
    @Value("${cat.api.url}")
    private String apiUrl;
    
    @Value("${cat.api.key}")
    private String apiKey;


    // listando todas as Raças
    public Breed[] getBreeds() {
        try {
            // Fazendo o GET
            String url = apiUrl + "/breeds?api_key=" + apiKey;
            return restTemplate.getForObject(url, Breed[].class);
            
        } catch (RestClientException e) {
            e.printStackTrace();
            return new Breed[0];
        } catch (Exception e) {
            e.printStackTrace();
            return new Breed[0];
        }
    }

    //Listando uma Raça 
    public Breed[] getBreed(@PathVariable String nameBreed) {
        System.out.println(apiUrl+"/breeds/search?q=air" );
        try {
            // Fazendo o GET
            return  restTemplate.getForObject(apiUrl+"/breeds/search?q="+ nameBreed, Breed[].class);
         } catch (RestClientException e) {
            e.printStackTrace();
            return new Breed[0];
        } catch (Exception e) {
            e.printStackTrace();
            return new Breed[0];
        }
    }

    //Listando uma Raça de acordo com o Temperamento
    public Breed[] getBreedTemperament(@PathVariable String nameBreeString, String nameTemperament) {
        try {
            // Fazendo o GET
            return restTemplate.getForObject(apiUrl+"/breeds/search?q="+nameBreeString+"&temperament="+ nameTemperament, Breed[].class);
         } catch (RestClientException e) {
            e.printStackTrace();
            return new Breed[0];
        } catch (Exception e) {
            e.printStackTrace();
            return new Breed[0];
        }
    }

    //Listando uma Raça de acordo com a Origem
    public Breed[] getBreedOrigin(@PathVariable String nameBreeString, String nameOrigin) {
        try {
            // Fazendo o GET
            return restTemplate.getForObject(apiUrl+"/breeds/search?q="+nameBreeString+"&origin="+ nameOrigin, Breed[].class);
         } catch (RestClientException e) {
            e.printStackTrace();
            return new Breed[0];
        } catch (Exception e) {
            e.printStackTrace();
            return new Breed[0];
        }
    }
}
