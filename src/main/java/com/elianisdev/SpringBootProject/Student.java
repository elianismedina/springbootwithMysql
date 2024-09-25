package com.elianisdev.SpringBootProject;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "MARK")
    private int mark;

    @Column(name = "NAME")
    private String name;
}
