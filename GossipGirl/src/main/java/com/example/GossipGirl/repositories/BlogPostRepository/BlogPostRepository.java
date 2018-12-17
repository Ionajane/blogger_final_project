package com.example.GossipGirl.repositories.BlogPostRepository;

import com.example.GossipGirl.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>, BlogPostRepositoryCustom {
}
