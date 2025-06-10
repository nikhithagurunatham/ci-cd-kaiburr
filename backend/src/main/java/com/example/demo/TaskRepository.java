package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    // Find tasks whose name contains substring (case-insensitive)
    List<Task> findByNameContainingIgnoreCase(String name);
}
