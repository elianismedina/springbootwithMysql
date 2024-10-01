package com.elianisdev.SpringBootProject.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private int year;

    private int votes;
    private double rating;

    @Column(name = "image_url")
    private String imageUrl;

}
