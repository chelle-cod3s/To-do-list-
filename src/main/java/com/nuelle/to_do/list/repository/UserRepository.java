package com.nuelle.to_do.list.repository;

import com.nuelle.to_do.list.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
