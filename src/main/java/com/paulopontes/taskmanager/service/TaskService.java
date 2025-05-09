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
        Task taskToUpdate = getTaskById(id);
        if(taskToUpdate == null) {
            return null;
        }
        taskToUpdate.setStatus(status);
        return taskRepository.save(taskToUpdate);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}
