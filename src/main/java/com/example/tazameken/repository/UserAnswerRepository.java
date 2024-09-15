package com.example.tazameken.repository;

import com.example.tazameken.model.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {

    @Query("select count(ua) from UserAnswer ua where ua.user.id = :userId and ua.answer.isCorrect = true")
    Integer findPointByUserId(Long userId);
}