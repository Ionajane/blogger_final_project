package com.example.GossipGirl.repositories.ArticleRepository;

import com.example.GossipGirl.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositoryCustom {
    //TODO: Query Methods
}
