package com.inqoo.project_cayliflower_backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @OneToMany
    private List<Training> trainings;

    public Subcategory() {
    }

    public Subcategory(String name, List<Training> trainings) {
        this.name = name;
        this.trainings = trainings;

    }

    public Long getId() {
        return id;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTraining(Training newTraining) {
        trainings.add(newTraining);
    }
}
