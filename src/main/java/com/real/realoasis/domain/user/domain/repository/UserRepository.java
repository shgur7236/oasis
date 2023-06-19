package com.real.realoasis.domain.user.domain.repository;


import com.real.realoasis.domain.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserById(String id);
    Optional<User> findUserByEmail(String email);
    boolean existsUserById(String id);
}
