package com.example.tazameken.repository;

import com.example.tazameken.model.Clothe;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClotheRepository extends JpaRepository<Clothe, Long>, JpaSpecificationExecutor<Clothe> {
}