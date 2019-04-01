package com.example.teatracker.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue
    private int brand_id;

    //@NotNull
    //@Size(min=2, max=25)
    @Size(min=2)
    private String brand_name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private List<Tea> tea = new ArrayList<>();

    public Brand(){
    }
    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public  List<Tea> getTeas() {
        return tea;
    }
}
