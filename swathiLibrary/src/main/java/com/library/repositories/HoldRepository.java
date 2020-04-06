package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Hold;

public interface HoldRepository extends JpaRepository<Hold, Long> {

}
