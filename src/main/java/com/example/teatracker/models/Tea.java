package com.example.teatracker.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Tea {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @Size(min=2, max=25)
    //@Size(min=2)
    private String name;


// out until I figure this out.
    //@NotNull
//    @Size()
//    private Boolean like_dislike;

    @ManyToOne
    private Brand brand;

//    @ManyToMany(mappedBy = "teas")
//    private List<TeaType> teaTypes;



    public Tea(String name) {

        this.name = name;
    }

    public Tea() {
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {

        this.id = id;
    }



    public Brand getBrand() {

        return brand;
    }


    public void setBrand(Brand brand) {

        this.brand = brand;
    }


//    public Boolean getLike_dislike() {
//        return like_dislike;
//    }
//
//    public void setLike_dislike(Boolean like_dislike) {
//        this.like_dislike = like_dislike;
//    }

//    public List<TeaType> getTeaType(){
//        return teaTypes;
//    }
}
