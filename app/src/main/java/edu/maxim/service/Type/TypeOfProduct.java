package edu.maxim.service.Type;

public enum TypeOfProduct { 
    ELECTRIC ("electric"),
    WOOD ("wood"), 
    FOOD ("food"), 
    MECHENIC ("mechenic"), 
    MANUAL ("manual"), 
    OTHER ("other");

    private String title;

    TypeOfProduct(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
