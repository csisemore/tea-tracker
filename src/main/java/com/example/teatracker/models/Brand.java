package com.example.teatracker.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    //@Size(min=2, max=25)
    @Size(min=2)
    private String brand_name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private List<Tea> teas = new ArrayList<>();

    public Brand(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  List<Tea> getTeas() {
        return teas;
    }
}
