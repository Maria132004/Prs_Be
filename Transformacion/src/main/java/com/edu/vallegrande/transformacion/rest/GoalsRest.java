package com.edu.vallegrande.transformacion.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.vallegrande.transformacion.model.Goal;
import com.edu.vallegrande.transformacion.service.GoalsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/goals")
public class GoalsRest {

    private final GoalsService goalsService;

    @GetMapping
    public ResponseEntity<List<Goal>> listAllGoals() {
        return ResponseEntity.ok(goalsService.listAllGoals());
    }

    @PostMapping
    public ResponseEntity<Goal> addGoal(@RequestBody Goal goals) {
    	goalsService.addGoal(goals);
        return ResponseEntity.ok().build();
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Goals> updateGoal(@PathVariable Long id, @RequestBody GoalDto goalDto) {
//        return goalsService.updateGoal(id, goalDto)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteGoal(@PathVariable Long id) {
    	goalsService.deleteGoal(id);
    	return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Goal> findGoalById(@PathVariable Long id) {
    	Optional<Goal> optional = goalsService.findGoalById(id);
        return optional.isPresent() ? ResponseEntity.ok(optional.get()) : ResponseEntity.notFound().build();
    }
}
