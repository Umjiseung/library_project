package com.covenant.springbootmysql.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonManagedReference
    private Author author;
}
