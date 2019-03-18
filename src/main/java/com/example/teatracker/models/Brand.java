package com.example.teatracker.models;

//import com.sun.istack.internal.NotNull;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Brand {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=2, max=25)
    //private String brand;
    private String brand_name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private List<Tea> teas = new ArrayList<>();

    public int getId() {
        return id;
    }


    public String getBrand_Name() {
        return brand_name;
    }

    public void setBrand_Name(String brand_Name) {
        brand_name = brand_Name;
    }


}
