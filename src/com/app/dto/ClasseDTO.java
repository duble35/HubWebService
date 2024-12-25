package com.app.dto;

public class ClasseDTO {
    
    private int id;
    private String classe;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    public String getClasse(){
        return classe;
    }
}
