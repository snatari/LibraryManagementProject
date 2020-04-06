package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Magazine;

public interface MagazineRepository extends JpaRepository<Magazine, String> {

}
