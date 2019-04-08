package com.example.teatracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


/***** out temporarily
public enum TeaType {
    HERBAL ("Herbal"),
    BLACK ("Black"),
    GREEN ("Green"),
    WHITE ("White"),
    CHAI ("Chai"),
    OOLONG ("Oolong"),
    ROOIBOS ("Rooiboos"),
    MATCHA ("Matcha"),
    PUREH ("Pu'reh");

    private final String teaType;

    TeaType(String teaType){
        this.teaType = teaType;
    }

    public String getTeaType() {
        return teaType;
    }

}

 ***/


@Entity
public class TeaType {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String teaType;

//    @ManyToMany(mappedBy = "teas")
//    private List<Tea> teas;


    public TeaType(){
    }

//    public void addItem(Tea item)
//    {teas.add(item);}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }
//    public List<Tea> getTeas(){
//        return teas;
//    }


}

