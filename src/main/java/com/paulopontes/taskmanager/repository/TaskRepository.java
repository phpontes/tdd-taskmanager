package com.paulopontes.taskmanager.repository;

import com.paulopontes.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
