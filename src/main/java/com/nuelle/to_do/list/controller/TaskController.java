package com.nuelle.to_do.list.controller;

import com.nuelle.to_do.list.model.Task;
import com.nuelle.to_do.list.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Task saveTask (@RequestBody Task task) {
        return taskService.saveTasks(task);
    }


     @PutMapping
     public Task updateTask(){
        return taskService.updateTask(Long );
     }

    @DeleteMapping("/{id}")
    public void deleteUser (@PathVariable Long id) {
        taskService.deleteTask(id);
    }






}
