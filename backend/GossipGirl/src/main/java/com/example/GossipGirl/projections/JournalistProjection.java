package com.example.GossipGirl.projections;

import com.example.GossipGirl.models.Article;
import com.example.GossipGirl.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedArticles", types = Journalist.class)
public interface JournalistProjection {
    long getId();
    String getFName();
    String getLName();
    String getField();
    List<ArticleProjection> getArticles();
}
