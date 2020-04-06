package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.CheckOut;

public interface CheckOutRepository extends JpaRepository<CheckOut, Long> {

}
