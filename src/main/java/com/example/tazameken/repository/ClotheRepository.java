package com.example.tazameken.repository;

import com.example.tazameken.model.Clothe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClotheRepository extends JpaRepository<Clothe, Long> {
}