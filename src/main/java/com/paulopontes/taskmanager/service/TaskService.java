package com.paulopontes.taskmanager.service;

import com.paulopontes.taskmanager.model.Task;
import com.paulopontes.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task updateTaskStatus(Long id, String status) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if(taskOptional.isPresent()) {
            Task t = taskOptional.get();
            t.setStatus(status);
            return taskRepository.save(t);
        }
        return null;
    }
}
