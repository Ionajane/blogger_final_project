package com.example.GossipGirl;

import com.example.GossipGirl.models.Article;
import com.example.GossipGirl.models.Journalist;
import com.example.GossipGirl.repositories.ArticleRepository.ArticleRepository;
import com.example.GossipGirl.repositories.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GossipGirlApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;


	@Test
	public void contextLoads() {
	}

	//check that article and journalist save to the database;

	@Test
	public void canAddArticle() {
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
		Article article1 = new Article("10 min workout", date, "Fitness", Jenny);
		articleRepository.save(article1);

	}

}

