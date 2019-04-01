package com.example.teatracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class TeaType {


    @Id
    @GeneratedValue
    private int tea_type_id;



    @NotNull
    private String tea_type;



    public int getTea_type_id() {
        return tea_type_id;
    }

    public void setTea_type_id(int tea_type_id) {
        this.tea_type_id = tea_type_id;
    }

    public String getTea_type() {
        return tea_type;
    }

    public void setTea_type(String tea_type) {
        this.tea_type = tea_type;

    }

}
