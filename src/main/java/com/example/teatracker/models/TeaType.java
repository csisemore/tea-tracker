package com.example.teatracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class TeaType {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String tea_type;

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

    public String getTea_type() {
        return tea_type;
    }

    public void setTea_type(String tea_type) {
        this.tea_type = tea_type;
    }
//    public List<Tea> getTeas(){
//        return teas;
//    }

}
