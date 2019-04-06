package com.example.teatracker.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeaType {


    @Id
    @GeneratedValue
    private int id;


    @NotNull
    private String teaType;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Tea> teas = new ArrayList<>();

    public TeaType(){
    }

    public  List<Tea> getTeas() {
        return teas;
    }

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

}
