package com.example.teatracker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Tea {
    @Id
    @GeneratedValue
    private int tea_id;


    @NotNull
    //@Size(min=2, max=25)
    @Size(min=2)
    private String tea_name;


// out until I figure this out.
    //@NotNull
//    @Size()
//    private Boolean like_dislike;

    @ManyToOne
    private Brand brand;


//    public Tea(String tea_name, Boolean like_dislike) {
    public Tea(String tea_name) {
        this.tea_name = tea_name;
        //       this.like_dislike = like_dislike;
    }

    public Tea() {
    }

    public int getTea_id() {
        return tea_id;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

//    public Boolean getLike_dislike() {
//        return like_dislike;
//    }
//
//    public void setLike_dislike(Boolean like_dislike) {
//        this.like_dislike = like_dislike;
//    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
