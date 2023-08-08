package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer>{

	Optional<Schedule> findByLoanAccountNumber(String loanAccountNumber);
	
}
