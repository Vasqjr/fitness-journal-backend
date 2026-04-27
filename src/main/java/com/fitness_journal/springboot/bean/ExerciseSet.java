package com.fitness_journal.springboot.bean;

public class ExerciseSet {
    private Long id;
    private Integer setNumber;
    private Double weight;
    private Integer reps;
    private boolean completed;

    public ExerciseSet() {

    }

    public ExerciseSet(Long id, Integer setNumber, Double weight, Integer reps, boolean completed) {
        this.id = id;
        this.setNumber = setNumber;
        this.weight = weight;
        this.reps = reps;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
