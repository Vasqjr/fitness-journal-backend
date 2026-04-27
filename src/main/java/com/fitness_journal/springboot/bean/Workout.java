package com.fitness_journal.springboot.bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private Long id;
    private String name;
    private LocalDateTime performedAt;
    private String notes;
    private List<Exercise> exercises = new ArrayList<>();

    public Workout() {

    }

    public Workout(Long id, String name, LocalDateTime performedAt, String notes, List<Exercise> exercises) {
        this.id = id;
        this.name = name;
        this.performedAt = performedAt;
        this.notes = notes;
        this.exercises = exercises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getPerformedAt() {
        return performedAt;
    }

    public void setPerformedAt(LocalDateTime performedAt) {
        this.performedAt = performedAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public int getTotalSets() {
        return exercises.stream()
                .mapToInt(exercise -> exercise.getSets().size())
                .sum();
    }

    public int getTotalReps() {
        return exercises.stream()
                .flatMap(exercise -> exercise.getSets().stream())
                .mapToInt(ExerciseSet::getReps)
                .sum();
    }

    public double getTotalVolume(){
        return exercises.stream()
                .flatMap(exercise -> exercise.getSets().stream())
                .mapToDouble(set -> set.getWeight() * set.getReps())
                .sum();
    }

    public double getHeaviestWeight() {
        return exercises.stream()
                .flatMap(exercise -> exercise.getSets().stream())
                .mapToDouble(ExerciseSet::getWeight)
                .max()
                .orElse(0.0);
    }
}
