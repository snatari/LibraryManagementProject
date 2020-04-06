package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.LibraryBook;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long> {

}
