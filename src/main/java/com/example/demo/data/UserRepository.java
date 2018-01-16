package com.example.demo.data;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String s);
    List<User> findAllByDepartment_Id(long id);
}
