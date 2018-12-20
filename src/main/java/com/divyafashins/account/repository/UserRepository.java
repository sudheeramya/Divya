package com.divyafashins.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divyafashins.account.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
