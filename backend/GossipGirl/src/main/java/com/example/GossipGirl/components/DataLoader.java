package com.example.GossipGirl.components;

import com.example.GossipGirl.models.Article;
import com.example.GossipGirl.models.Journalist;
import com.example.GossipGirl.repositories.ArticleRepository.ArticleRepository;
import com.example.GossipGirl.repositories.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    ArticleRepository articleRepository;

    //empty constructor
    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        DateFormat sfd = new SimpleDateFormat("DD-MM-YYYY");
        String newDate = "24-07-2018";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Journalist Jenny = new Journalist("Jenny", "Humphrey", "Fashion");
        journalistRepository.save(Jenny);

        Journalist Blair = new Journalist("Blair", "Wardolf", "Food");
        journalistRepository.save(Blair);

        Article article1 = new Article("10 min workout", date, "Fitness", "INPUT TEXT HERE", Jenny);
        articleRepository.save(article1);

        Article article2 = new Article("10 mins to make prep meals", date, "Food", "INPUT TEXT HERE",Blair);
        articleRepository.save(article2);
    }
}
