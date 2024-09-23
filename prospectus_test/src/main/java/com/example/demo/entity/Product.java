package com.example.demo.entity;

import com.example.demo.Enum.Category;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    double price;

    @Column(length = 1000)
    String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    Category category;


    String image;

    @Embedded
    Rating rating;

}
