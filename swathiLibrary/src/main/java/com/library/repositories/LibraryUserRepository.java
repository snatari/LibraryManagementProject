package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.LibraryUser;

public interface LibraryUserRepository extends JpaRepository<LibraryUser, Long> {

}
