package com.example.javaallinone.project4.friendsystem.repository;

import com.example.javaallinone.project4.friendsystem.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
