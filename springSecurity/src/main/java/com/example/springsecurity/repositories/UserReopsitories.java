package com.example.springsecurity.repositories;

import com.example.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReopsitories extends JpaRepository<User, Long>
{
    User findByUsername(String username);
}
