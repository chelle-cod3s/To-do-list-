package com.nuelle.to_do.list.repository;

import com.nuelle.to_do.list.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
}
