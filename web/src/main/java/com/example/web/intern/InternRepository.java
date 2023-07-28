package com.example.web.intern;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
public interface InternRepository extends JpaRepository<Intern, Long> {
    // You can add custom query methods here if needed
    @Query("SELECT s FROM mydatabase s WHEWE  s.name = ?1")
    Optional<Intern> findInternByName(String name);
    @Query("SELECT s FROM mydatabase s WHEWE  s.id = ?1")
    Optional<Intern> findById(int id);
    Optional<Intern> existsById(int id);
}
