package com.example.task_tracker;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*") // Allow frontend requests
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Map<String, String> body) {
        String description = body.get("description");
        return taskService.addTask(description);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}/complete")
    public void completeTask(@PathVariable Long id) {
        taskService.markComplete(id);
    }
}
