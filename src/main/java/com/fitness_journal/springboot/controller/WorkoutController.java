package com.fitness_journal.springboot.controller;

import com.fitness_journal.springboot.bean.Exercise;
import com.fitness_journal.springboot.bean.ExerciseSet;
import com.fitness_journal.springboot.bean.Workout;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "http://localhost:5173")
public class WorkoutController {
    @GetMapping("/{id}")
    public List<Workout> getWorkout(@PathVariable Long id){
        //Create Workout
        Workout w = new Workout();
        w.setId(id);
        w.setName("Push Day");
        w.setPerformedAt(LocalDateTime.of(2026, 4, 13, 12, 30));
        w.setNotes("Felt strong today");

        //Create Exercise
        Exercise e1 = new Exercise();
        e1.setId(101L);
        e1.setName("Bench Press");
        e1.setOrderIndex(1);
        e1.setNotes("Paused first rep");

        //Create Each Set for Exercise
        ExerciseSet e1s1 = new ExerciseSet();
        e1s1.setId(1001L);
        e1s1.setSetNumber(1);
        e1s1.setWeight(135.0);
        e1s1.setReps(10);
        e1s1.setCompleted(true);

        ExerciseSet e1s2 = new ExerciseSet();
        e1s2.setId(1002L);
        e1s2.setSetNumber(2);
        e1s2.setWeight(155.0);
        e1s2.setReps(8);
        e1s2.setCompleted(true);

        ExerciseSet e1s3 = new ExerciseSet();
        e1s3.setId(1003L);
        e1s3.setSetNumber(3);
        e1s3.setWeight(165.0);
        e1s3.setReps(6);
        e1s3.setCompleted(true);

        // Create List of Sets, add to Exercise
        List<ExerciseSet> e1Sets = new ArrayList<>();
        e1Sets.add(e1s1);
        e1Sets.add(e1s2);
        e1Sets.add(e1s3);
        e1.setSets(e1Sets);

        Exercise e2 = new Exercise();
        e2.setId(102L);
        e2.setName("Incline Dumbbell Press");
        e2.setOrderIndex(2);
        e2.setNotes("Last set close to failure");

        ExerciseSet e2s1 = new ExerciseSet();
        e2s1.setId(2001L);
        e2s1.setSetNumber(1);
        e2s1.setWeight(60.0);
        e2s1.setReps(10);
        e2s1.setCompleted(true);

        ExerciseSet e2s2 = new ExerciseSet();
        e2s2.setId(2002L);
        e2s2.setSetNumber(2);
        e2s2.setWeight(65.0);
        e2s2.setReps(8);
        e2s2.setCompleted(true);

        List<ExerciseSet> e2Sets = new ArrayList<>();
        e2Sets.add(e2s1);
        e2Sets.add(e2s2);
        e2.setSets(e2Sets);

        // Create List of Exercises, add Exercises to Workout
        List<Exercise> exercises = new ArrayList<>();
        exercises.add(e1);
        exercises.add(e2);
        w.setExercises(exercises);

        return List.of(w);
    }
}
