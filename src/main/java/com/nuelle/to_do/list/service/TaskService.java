package com.nuelle.to_do.list.service;


import com.nuelle.to_do.list.model.Task;
import com.nuelle.to_do.list.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }


    public Task saveTasks(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Long id, Task updateTask) {
        Optional<Task> foundTask = taskRepository.findById(id);

        if (foundTask.isPresent()) {
            Task newTask = foundTask.get();

            newTask.setTitle(updateTask.getTitle());
            newTask.setCreatedAt(updateTask.getCreatedAt());
            newTask.setCompleted(updateTask.getCompleted());
            newTask.setDescription(updateTask.getDescription());

            return taskRepository.save(updateTask);
        }
       else throw new RuntimeException("Task not found") ;
    }
}






