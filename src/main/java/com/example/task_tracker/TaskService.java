package com.example.task_tracker;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskService {
    private Map<Long, Task> tasks = new HashMap<>();
    private Long nextId = 1L;

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task addTask(String description) {
        Task task = new Task(nextId++, description, false);
        tasks.put(task.getId(), task);
        return task;
    }

    public boolean deleteTask(Long id) {
        return tasks.remove(id) != null;
    }

    public boolean markComplete(Long id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setCompleted(true);
            return true;
        }
        return false;
    }
}
