package com.example.HashingSalting.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HashingSalting.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findByUsername(String username);
}
