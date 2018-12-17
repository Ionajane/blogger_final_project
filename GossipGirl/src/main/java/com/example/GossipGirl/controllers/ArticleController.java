package com.example.GossipGirl.controllers;

import com.example.GossipGirl.models.Article;
import com.example.GossipGirl.repositories.ArticleRepository.ArticleRepository;
import com.example.GossipGirl.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")

public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @PutMapping(value= "/articles/{id}")
    public void viewOneArticle(@PathVariable long id) {
        Article article = articleRepository.getOne(id);
        articleRepository.save(article);
    }


//    TODO: GET CATEGORY OF ARTICLE
//    @PutMapping(value = "/articles/{category}")
//    public void viewCategoryOfArticles(@PathVariable String category) {
//        Article article = articleRepository.----(category);
//        articleRepository.save(article);
//    }

//    TODO: GET DATE OF ARTICLE
//    @PutMapping(value = "/articles/{date}")
//    public void viewDateOfArticles(@PathVariable Date date) {
//        Article article = articleRepository.----(category);
//        articleRepository.save(article);
//    }


}
