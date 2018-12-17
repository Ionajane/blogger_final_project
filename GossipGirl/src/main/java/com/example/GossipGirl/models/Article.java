package com.example.GossipGirl.models;

import javax.persistence.*;

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
    private String date;

    @ManyToOne
    @JoinColumn(name= "journalist_id", nullable = false)
    private Journalist journalist;

    //constructor
    public Article(String title, String date, Journalist journalist) {
        this.title = title;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }
}
