package com.divyafashins.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divyafashins.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
