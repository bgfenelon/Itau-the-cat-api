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
    public String getBreed(@PathVariable String nameBreed) {
        System.out.println(apiUrl+"/breeds/search?q=air" );
        try {
            // Fazendo o GET
            String response = restTemplate.getForObject(apiUrl+"/breeds/search?q="+ nameBreed, String.class);
            return response;
        } catch (RestClientException e) {
            // Trata erros de conexão ou HTTP
            e.printStackTrace();
            return "Erro ao acessar a API: " + e.getMessage();
        } catch (Exception e) {
            // Trata outros erros gerais
            e.printStackTrace();
            return "Erro inesperado: " + e.getMessage();
        }
    }

    //Listando uma Raça de acordo com o Temperamento
    public String getBreedTemperament(@PathVariable String nameBreeString, String nameTemperament) {
        try {
            // Fazendo o GET
            String response = restTemplate.getForObject(apiUrl+"/breeds/search?q="+nameBreeString+"&temperament="+ nameTemperament, String.class);
            return response;
        } catch (RestClientException e) {
            // Trata erros de conexão ou HTTP
            e.printStackTrace();
            return "Erro ao acessar a API: " + e.getMessage();
        } catch (Exception e) {
            // Trata outros erros gerais
            e.printStackTrace();
            return "Erro inesperado: " + e.getMessage();
        }
    }

    //Listando uma Raça de acordo com a Origem
    public String getBreedOrigin(@PathVariable String nameBreeString, String nameOrigin) {
        try {
            // Fazendo o GET
            String response = restTemplate.getForObject(apiUrl+"/breeds/search?q="+nameBreeString+"&origin="+ nameOrigin, String.class);
            return response;
        } catch (RestClientException e) {
            // Trata erros de conexão ou HTTP
            e.printStackTrace();
            return "Erro ao acessar a API: " + e.getMessage();
        } catch (Exception e) {
            // Trata outros erros gerais
            e.printStackTrace();
            return "Erro inesperado: " + e.getMessage();
        }
    }
}
