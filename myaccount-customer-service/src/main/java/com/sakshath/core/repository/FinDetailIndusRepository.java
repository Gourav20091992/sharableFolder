package com.sakshath.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.FinDetailIndus;

@Repository
public interface FinDetailIndusRepository extends JpaRepository<FinDetailIndus,Long> {



}
