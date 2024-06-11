package com.astha.springboot.WebProjectWithReact.repository;

import com.astha.springboot.WebProjectWithReact.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
