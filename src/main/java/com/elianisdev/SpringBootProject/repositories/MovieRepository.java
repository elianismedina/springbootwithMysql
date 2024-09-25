package com.elianisdev.SpringBootProject.repositories;

import com.elianisdev.SpringBootProject.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
