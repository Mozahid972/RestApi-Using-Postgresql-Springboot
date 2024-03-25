package com.postgresql.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    @Id
    private String id;
    private String name;
    private String category;
    private String rating;

    // Other fields and methods
    }


