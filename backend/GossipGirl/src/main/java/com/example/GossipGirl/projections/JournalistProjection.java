package com.example.GossipGirl.projections;

import com.example.GossipGirl.models.Article;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedJournalists", types = Article.class)
public interface JournalistProjection {
    long getId();
    String getFName();
    String getLName();
    String getField();
    List<ArticleProjection> getArticles();
}
