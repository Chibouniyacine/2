package com.memoire.demo.Object;

import javax.persistence.*;

@Entity
@Table
public class Object {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String name;
    private String photo;

    public Object() {
    }

    public Object(Integer id, String name, String photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public Object(String name){
        this.name = name;
    }

    public Object(String s, String book) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
