package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.DVD;

public interface DVDRepository extends JpaRepository<DVD, String> {

}
