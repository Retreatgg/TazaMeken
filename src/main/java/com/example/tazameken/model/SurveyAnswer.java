package com.example.tazameken.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "survey_answers")
public class SurveyAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_answers_id_gen")
    @SequenceGenerator(name = "survey_answers_id_gen", sequenceName = "survey_answers_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "answer_text")
    private String answerText;

    @Column(name = "is_correct")
    private Boolean isCorrect;

}