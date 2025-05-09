package com.paulopontes.taskmanager.repository;

import com.paulopontes.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @Test
    void testSaveTask() {
        //arrange
        Task task = new Task();
        task.setTitle("Test task");
        task.setStatus("To do");
        //act
        Task savedTask = taskRepository.save(task);
        //assert
        assertNotNull(savedTask);
        assertEquals("Test task", savedTask.getTitle());
    }
}
