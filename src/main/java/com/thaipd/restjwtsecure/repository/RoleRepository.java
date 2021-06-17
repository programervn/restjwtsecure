package com.thaipd.restjwtsecure.repository;

import java.util.Optional;

import com.thaipd.restjwtsecure.model.ERole;
import com.thaipd.restjwtsecure.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
