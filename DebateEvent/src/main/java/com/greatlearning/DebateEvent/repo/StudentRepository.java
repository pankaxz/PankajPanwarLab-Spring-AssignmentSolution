package com.greatlearning.DebateEvent.repo;

import com.greatlearning.DebateEvent.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
