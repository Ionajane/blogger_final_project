package com.example.GossipGirl.projections;

import com.example.GossipGirl.models.Journalist;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedJournalists", types = Journalist.class)
public interface ArticleProjection {
    long getId();
    String getTitle();
    Date getDate();
    String getCategory();
    String getBody();
    Journalist getJournalists();

}
