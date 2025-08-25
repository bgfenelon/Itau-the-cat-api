package com.bianca.the_cat_api.model;

public class Breed {
    private String _id;
    private String origin;
    private String raca;
    private String temperament;
    private String description;    

    // Getters e Setters
    public String get_id() { return _id; }
    public void set_id(String id) { this._id = id; }

    public String getRaca() { return raca; }
    public void setName(String name) { this.raca = name; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getTemperament() { return temperament; }
    public void setTemperament(String temperament) { this.temperament = temperament; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    
    @Override
    public String toString() {
        return "Breed{_id='" + _id + "', raca='" + raca + "', origem='" + origin + "', temperamento='" + temperament +"', descricao='" + description +"'}";
    }
}

