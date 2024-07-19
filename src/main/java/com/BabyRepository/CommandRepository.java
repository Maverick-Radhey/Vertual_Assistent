package com.BabyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.CommandEntity;

@Repository
public interface CommandRepository extends JpaRepository<CommandEntity, Long> {

}
