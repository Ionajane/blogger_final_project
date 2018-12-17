package com.example.GossipGirl.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(name= "category")
    private String category;

    //@OneToMany ( ONE journalist to many articles)
    @JsonIgnore
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY)
    private List<Article> article;

    //constructor
    public Journalist(String fName, String lName, String category) {
        this.fName = fName;
        this.lName = lName;
        this.category = category;
        this.article = new ArrayList<>();
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }
}
