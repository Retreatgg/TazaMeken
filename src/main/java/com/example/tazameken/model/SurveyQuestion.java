package com.example.tazameken.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "survey_questions")
public class SurveyQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_questions_id_gen")
    @SequenceGenerator(name = "survey_questions_id_gen", sequenceName = "survey_questions_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "question_text")
    private String questionText;

}