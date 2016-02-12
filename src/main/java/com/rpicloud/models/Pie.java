package com.rpicloud.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kaspernissen on 11/02/2016.
 */
@Entity
public class Pie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    public Pie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //for JPA
    public Pie() {}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
