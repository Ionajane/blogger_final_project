package com.example.GossipGirl.repositories.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

    @Autowired
    EntityManager entityManager;


}
