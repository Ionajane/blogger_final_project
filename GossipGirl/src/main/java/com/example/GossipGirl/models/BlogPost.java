package com.example.GossipGirl.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "blog_posts")
public class BlogPost {

    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "blogPost_articles", joinColumns = {
            @JoinColumn(
                    name = "blogPost_id",
                    nullable = false,
                    updatable = false
            )
    },
            inverseJoinColumns = {
                    @JoinColumn(name = "article_id",
                            nullable = false,
                            updatable = false
                    )
    })
    private List<Article> articles;

    //constructor
    public BlogPost() {
        this.articles = new ArrayList<Article>();
    }

    //empty constructor
//    public BlogPost() {
//    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Article> getArticle() {
        return articles;
    }

    public void setArticle(List<Article> article) {
        this.articles = articles;
    }

    public void addArticleToBlog(Article article) {
        this.articles.add(article);
    }

}
