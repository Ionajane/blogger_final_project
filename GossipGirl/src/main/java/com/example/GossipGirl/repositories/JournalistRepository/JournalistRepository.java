package com.example.GossipGirl.repositories.JournalistRepository;

import com.example.GossipGirl.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {

}
