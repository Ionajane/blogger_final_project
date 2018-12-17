package com.example.GossipGirl.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name= "journalists")

public class Journalist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "first_name")
    private String fName;

    @Column(name= "last_name")
    private String lName;

    @Column(name= "field")
    private String field;

    @JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy= "journalist", fetch = FetchType.LAZY)
    private List<Article> articles;


    //constructor
    public Journalist(String fName, String lName, String field) {
        this.fName = fName;
        this.lName = lName;
        this.field = field;
        this.articles = new ArrayList<>();
    }

    //empty constructor
    public Journalist() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
