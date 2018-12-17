package com.example.GossipGirl.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name= "articles")
public class Article {

    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name = "date")
    private Date date;

    @Column(name="category")
    private String category;

    @ManyToOne
    @JoinColumn(name = "journalist_id", nullable = false)
    private Journalist journalist;


    //constructor
    public Article(String title, Date date, String category, Journalist journalist) {
        this.title = title;
        this.date = date;
        this.category = category;
        this.journalist = journalist;
    }

    //empty constructor
    public Article() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
