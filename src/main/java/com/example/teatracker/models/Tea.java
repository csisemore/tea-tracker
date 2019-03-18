package com.example.teatracker.models;

import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Tea {
    @Id
    @GeneratedValue
    private int id;


    @NotNull
    //@Size(min=2, max=25)
    @Size(min=2)
    private String tea_name;


    @NotNull
    @Size()
    private Boolean like_dislike;

    @ManyToOne
    private Brand brand;

    public Tea() {
    }

    public int getId() {
        return id;
    }
    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

    public Boolean getLike_dislike() {
        return like_dislike;
    }

    public void setLike_dislike(Boolean like_dislike) {
        this.like_dislike = like_dislike;
    }
}
