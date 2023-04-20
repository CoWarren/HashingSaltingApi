package com.example.HashingSalting.repository;

//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HashingSalting.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
