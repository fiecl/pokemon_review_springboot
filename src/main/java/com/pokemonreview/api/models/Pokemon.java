package com.pokemonreview.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data // generates getters, setters, and even constructor
@AllArgsConstructor
@NoArgsConstructor
@Entity // to tell Spring that this is a table
public class Pokemon {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrementing
    private int id;
    private String name;
    private String type;

    // orphanRemoval: If our Pokemon is gone, we also want the review to be gone too
    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<Review>();


//    public Pokemon(int id, String name, String type) {
//        this.id = id;
//        this.name = name;
//        this.type = type;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
}
