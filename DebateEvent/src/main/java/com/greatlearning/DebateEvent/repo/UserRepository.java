package com.greatlearning.DebateEvent.repo;

import com.greatlearning.DebateEvent.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByUsername(String username);
}
