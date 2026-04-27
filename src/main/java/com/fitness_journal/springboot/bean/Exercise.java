package com.fitness_journal.springboot.bean;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private Long id;
    private String name;
    private Integer orderIndex;
    private String notes;
    private List<ExerciseSet> sets = new ArrayList<>();

    public Exercise() {

    }

    public Exercise(Long id, String name, Integer orderIndex, String notes, List<ExerciseSet> sets) {
        this.id = id;
        this.name = name;
        this.orderIndex = orderIndex;
        this.notes = notes;
        this.sets = sets;
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

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<ExerciseSet> getSets() {
        return sets;
    }

    public void setSets(List<ExerciseSet> sets) {
        this.sets = sets;
    }
}
