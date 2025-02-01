package com.nuelle.to_do.list.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name ="fields")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String Title;


    private String Description;


    private Boolean Completed;


    private LocalDateTime CreatedAt;


    private LocalDateTime UpdatedAt;


}