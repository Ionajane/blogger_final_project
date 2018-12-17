package com.example.GossipGirl.controllers;

import com.example.GossipGirl.models.Journalist;
import com.example.GossipGirl.repositories.ArticleRepository.ArticleRepository;
import com.example.GossipGirl.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/journalists")
public class JournalistController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @PutMapping(value= "/journalists/{id}")
    public void viewJournalist(@PathVariable long id) {
        Journalist journalist = journalistRepository.getOne(id);
        journalistRepository.save(journalist);
    }
}
