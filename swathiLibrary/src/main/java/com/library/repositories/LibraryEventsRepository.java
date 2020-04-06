package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.model.LibraryEvents;

public interface LibraryEventsRepository extends JpaRepository<LibraryEvents, String> {

}
