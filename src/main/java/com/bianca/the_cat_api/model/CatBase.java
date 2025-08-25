package com.bianca.the_cat_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "catsBase")
public class CatBase {

    @Id
    private String _id;
    private String raca;
    private String origem;
    private String temperamento;
    private String descricao;

    // Construtores
    public CatBase() {}

    public CatBase(String _id,String raca,String origem, String temperamento, String descricao) {
        this._id = _id;
        this.raca = raca;
        this.origem = origem;
        this.temperamento = temperamento;
        this.descricao= descricao;
    }

    // Getters e Setters
    public String getId() { return _id; }
    public void setId(String _id) { this._id = _id; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    
    public String getTemperamento() { return temperamento; }
    public void setTemperamento(String temperamento) { this.temperamento = temperamento; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

}
