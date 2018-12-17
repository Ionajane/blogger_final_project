package com.example.GossipGirl;

import com.example.GossipGirl.models.Article;
import com.example.GossipGirl.models.BlogPost;
import com.example.GossipGirl.models.Journalist;
import com.example.GossipGirl.repositories.ArticleRepository.ArticleRepository;
import com.example.GossipGirl.repositories.BlogPostRepository.BlogPostRepository;
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

	@Autowired
	BlogPostRepository blogPostRepository;

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
		Article article1 = new Article("Bored of fruit? Tasty treats you will love!", date, "Fitness", Jenny);
		articleRepository.save(article1);
	}

	@Test
	public void canSaveBlogPostToDB() {
		DateFormat sfd = new SimpleDateFormat("DD-MM-YYYY");
		String newDate = "24-07-2018";
		Date date = null;
		try {
			date = sfd.parse(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Journalist Blair = new Journalist("Blair", "Waldorf", "Fitness");
		journalistRepository.save(Blair);

		Article article2 = new Article("Bored of fruit? Tasty treats you will love!", date, "Fitness", Blair);
		articleRepository.save(article2);

		BlogPost blogger1 = new BlogPost();
		blogPostRepository.save(blogger1);

		blogger1.addArticleToBlog(article2);
		blogPostRepository.save(blogger1);

	}



}

