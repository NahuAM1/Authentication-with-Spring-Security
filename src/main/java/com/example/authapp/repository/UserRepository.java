package com.example.authapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.authapp.entity.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u where u.username = ?1")
    Optional<User> findByName(String name);
}
