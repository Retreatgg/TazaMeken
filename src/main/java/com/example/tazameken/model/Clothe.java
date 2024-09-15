package com.example.tazameken.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clothes")
public class Clothe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clothes_id_gen")
    @SequenceGenerator(name = "clothes_id_gen", sequenceName = "clothes_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "color_id", nullable = false)
    private Color color;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gender_id", nullable = false)
    private Gender gender;

    @Size(max = 10)
    @Column(name = "size", length = 10)
    private String size;

    @Column(name = "price")
    private Long price;

    @Size(max = 250)
    @Column(name = "photo_name", length = 250)
    private String photoName;

    @Column(name = "is_sold")
    private Boolean isSold;

}