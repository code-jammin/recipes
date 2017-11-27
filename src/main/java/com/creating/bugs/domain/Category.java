package com.creating.bugs.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by steve on 15/11/17.
 */
@Data
@EqualsAndHashCode(exclude ="recipes")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
