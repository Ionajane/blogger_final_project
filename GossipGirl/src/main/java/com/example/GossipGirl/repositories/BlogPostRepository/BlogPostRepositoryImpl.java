package com.example.GossipGirl.repositories.BlogPostRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class BlogPostRepositoryImpl implements BlogPostRepositoryCustom{

    @Autowired
    EntityManager entityManager;

}
